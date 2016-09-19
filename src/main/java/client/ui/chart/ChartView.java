package client.ui.chart;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.Button;
import org.moxieapps.gwt.highcharts.client.*;
import org.moxieapps.gwt.highcharts.client.events.PointClickEvent;
import org.moxieapps.gwt.highcharts.client.events.PointClickEventHandler;
import org.moxieapps.gwt.highcharts.client.plotOptions.AreaSplinePlotOptions;
import org.moxieapps.gwt.highcharts.client.plotOptions.SeriesPlotOptions;

/**
 * Created by apoyark on 14.09.2016.
 */
public class ChartView extends Composite implements IChartView {

    private DecoratorPanel chartPanel;
    private VerticalPanel contentPanel;
    private Chart chart;
    private Button addPoint;
    private Series series;

    @Override
    public DecoratorPanel getBackgroundPanel() {
        return chartPanel;
    }

    @Override
    public Button getAddPointButton() {
        return addPoint;
    }

    @Override
    public Series getExistSeries() {
        return series;
    }

    public ChartView(){
        contentPanel = new VerticalPanel();
        contentPanel.setSize("700px","700px");
        addPoint = new Button("Add new point");
        addPoint.addStyleName("button");
        chartPanel = new DecoratorPanel();
        chartPanel.addStyleName("border");
        chart = new Chart()
                .setSeriesPlotOptions(new SeriesPlotOptions()
                        .setPointClickEventHandler(new PointClickEventHandler() {
                            public boolean onClick(PointClickEvent e) {
                                Window.alert("Clicked " + e.getXAsLong());
                                return true;
                            }
                        }))


                .setZoomType(BaseChart.ZoomType.X)

                .setAreaSplinePlotOptions(new AreaSplinePlotOptions()
                        .setFillOpacity(0.5)
                        .setFillColor("#CC0000"))
                .setLegend(new Legend()
                        .setLayout(Legend.Layout.VERTICAL)
                        .setAlign(Legend.Align.RIGHT)
                        .setVerticalAlign(Legend.VerticalAlign.TOP)
                        .setX(-10)
                        .setY(100)
                        .setBorderWidth(0)
                );



        series = chart.createSeries()
                .setPlotOptions(new AreaSplinePlotOptions()
                        .setFillColor("#000099")
                )
                .setName("My own chart")
                .setPoints(new Point[]{
                        new Point("Digger", 45.0).setColor("#4572A7"),
                        new Point("Greedy", 26.8).setColor("#AA4643"),
                        new Point("Torpedo", 12.8).setColor("#89A54E"),
                        new Point("Greedy", 89.0),
                        new Point("Hesoyam", 209.00)
                });
        chart.addSeries(series);
        contentPanel.add(chart);
        contentPanel.add(addPoint);
        chartPanel.add(contentPanel);
    }
}
