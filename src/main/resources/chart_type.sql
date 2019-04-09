INSERT INTO chart_type(name, ui_type) VALUES('BarChartModel', 'bar');
INSERT INTO chart_type(name, ui_type) VALUES('HorizontalBarChartModel', 'bar');
INSERT INTO chart_type(name, ui_type) VALUES('PieChartModel', 'pie');

UPDATE chart_type SET created_date = NOW();
