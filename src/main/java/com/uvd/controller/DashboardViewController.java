package com.uvd.controller;

import com.uvd.model.Dashboard;
import com.uvd.model.DynamicChart;
import org.primefaces.model.chart.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/dashboard-view")
@ManagedBean
@RequestScoped
@CrossOrigin("*")
public class DashboardViewController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  private List<DynamicChart> graphicList = new LinkedList<>();

  @Autowired
  private DashboardController dashboardController;

  @PersistenceContext
  private EntityManager entityManager;

  private final static String BAR_CHAR_MODEL = "BarChartModel";
  private final static String HORIZONTAL_BAR_CHAR_MODEL = "HorizontalBarChartModel";
  private final static String PIE_CHAR_MODEL = "PieChartModel";

  @PostConstruct
  public void initialise() {
    dashboardController.init();
    graphicList.clear();
    try {
      List<Dashboard> dashboardList = dashboardController.getList();

      for (Dashboard dashboard : dashboardList) {
        String uiType = dashboard.getChartType().getUiType();
        if (Boolean.parseBoolean(dashboard.getShow().getName())) {
          if (dashboard.getChartType().getName().equalsIgnoreCase(BAR_CHAR_MODEL)) {
            BarChartModel graphic = initBarChartModel(dashboard);
            graphicList.add(new DynamicChart(graphic, uiType));
          } else if (dashboard.getChartType().getName().equalsIgnoreCase(HORIZONTAL_BAR_CHAR_MODEL)) {
            HorizontalBarChartModel graphic = initHorizontalBarChartModel(dashboard);
            graphicList.add(new DynamicChart(graphic, uiType));
          } else if (dashboard.getChartType().getName().equalsIgnoreCase(PIE_CHAR_MODEL)) {
            PieChartModel graphic = initPieChartModel(dashboard);
            graphicList.add(new DynamicChart(graphic, uiType));
          }
        }
      }
    } catch (Exception ex) {
      logger.error("initialise(): " + ex);
    }
  }

  private HorizontalBarChartModel initHorizontalBarChartModel(Dashboard dashboard) {
    HorizontalBarChartModel model = new HorizontalBarChartModel();
    model.setTitle(dashboard.getName());
    model.setAnimate(Boolean.parseBoolean(dashboard.getAnimate().getName()));
    model.setLegendPosition(dashboard.getLegendPosition());

    List<Object[]> result = getQueryResult(dashboard.getQuery());
    for (Integer columnIndex : splitToInteger(dashboard.getShowColumn())) {
      model.addSeries(createChartSeries(result, columnIndex, dashboard.getSeriesList().get(columnIndex)));
    }

    Axis xAxis = model.getAxis(AxisType.X);
    xAxis.setMin(dashboard.getYmin());
    Long xmax = dashboard.getYmax();
    xAxis.setMax(xmax == 0 ? getMaxChartSeries(model.getSeries()) : xmax);

    return model;
  }

  private PieChartModel initPieChartModel(Dashboard dashboard){
    PieChartModel model = new PieChartModel();
    model.setTitle(dashboard.getName());
    model.setLegendPosition(dashboard.getLegendPosition());

    List<Object[]> result = getQueryResult(dashboard.getQuery());
    for (Object[] row : result) {
      Object groupObject = row[0];
      model.set("" + groupObject, (Number) row[1]);
    }

    return model;
  }

  private BarChartModel initBarChartModel(Dashboard dashboard) {
    BarChartModel model  = new BarChartModel();
    model.setTitle(dashboard.getName());
    model.setAnimate(Boolean.parseBoolean(dashboard.getAnimate().getName()));

    List<Object[]> result = getQueryResult(dashboard.getQuery());
    for (Integer columnIndex : splitToInteger(dashboard.getShowColumn())) {
      model.addSeries(createChartSeries(result, columnIndex, dashboard.getSeriesList().get(columnIndex)));
    }

    Axis yAxis = model.getAxis(AxisType.Y);
    yAxis.setMin(dashboard.getYmin());
    Long ymax = dashboard.getYmax();
    yAxis.setMax(ymax == 0 ? getMaxChartSeries(model.getSeries()) : ymax);

    return model;
  }

  /**
   * execute query for specific dashboard and return the results
   * @param query
   * @return
   */
  private List<Object[]> getQueryResult(String query) {
    return entityManager.createNativeQuery(query).getResultList();
  }

  private List<Integer> splitToInteger(String numbers){
    String [] list = numbers.split(",");
    List<Integer> result = new LinkedList<>();
    for (String listValue : list){
      result.add(new Integer(listValue));
    }
    return result;
  }

  private  Long getMaxChartSeries(List<ChartSeries> list){
    Number max = 0;
    for(ChartSeries cs : list){
      for (Number currentNumber : cs.getData().values()) {
        if (max.longValue() < currentNumber.longValue()) {
          max = currentNumber;
        }
      }
    }
    return max.longValue() + Math.round(max.longValue() * 0.1);
  }

  private ChartSeries createChartSeries(List<Object[]> result, int columnIndex, String seriesName){
    ChartSeries line = new ChartSeries();
    line.setLabel(seriesName);
    for (Object[] row : result) {
      Object groupObject = row[0];
      line.set(groupObject, (Number) row[columnIndex]);
    }
    return line;
  }

  public List<DynamicChart> getGraphicList() {
    return graphicList;
  }

  public void setGraphicList(List<DynamicChart> graphicList) {
    this.graphicList = graphicList;
  }

}