package com.uvd.model;

import com.uvd.model.ChartType;
import com.uvd.model.Constant;
import com.uvd.model.CoreEntity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sdrahnea
 */
@Entity
@Table(name = "dashboard")
public class Dashboard extends CoreEntity {

  @Lob
  @Column(name = "cquery")
  private String query;

  @Column(name = "ymax")
  private Long ymax;

  @Column(name = "ymin")
  private Long ymin;

  @JoinColumn(name = "chart_type_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private ChartType chartType;

  @Column(name = "legend_position")
  private String legendPosition;

  @JoinColumn(name = "show_constant_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private Constant show;

  @JoinColumn(name = "animate_constant_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private Constant animate;

  @Column(name = "show_column")
  private String showColumn;


  @Column(name = "series_tags")
  private String seriesTags;

  public List<String> getSeriesList() {
    return seriesTags != null ? Arrays.asList(seriesTags.split(",")) : new LinkedList<>();
  }

  public void setSeriesList(List<String> skillList) {
    this.seriesTags = String.join(",", skillList);
  }

  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public Long getYmax() {
    return ymax;
  }

  public void setYmax(Long ymax) {
    this.ymax = ymax;
  }

  public Long getYmin() {
    return ymin;
  }

  public void setYmin(Long ymin) {
    this.ymin = ymin;
  }

  public String getLegendPosition() {
    return legendPosition;
  }

  public void setLegendPosition(String legendPosition) {
    this.legendPosition = legendPosition;
  }

  public String getSeriesTags() {
    return seriesTags;
  }

  public void setSeriesTags(String seriesTags) {
    this.seriesTags = seriesTags;
  }

  public ChartType getChartType() {
    return chartType;
  }

  public void setChartType(ChartType chartType) {
    this.chartType = chartType;
  }

  public Constant getShow() {
    return show;
  }

  public void setShow(Constant show) {
    this.show = show;
  }

  public Constant getAnimate() {
    return animate;
  }

  public void setAnimate(Constant animate) {
    this.animate = animate;
  }

  public String getShowColumn() {
    return showColumn;
  }

  public void setShowColumn(String showColumn) {
    this.showColumn = showColumn;
  }

}
