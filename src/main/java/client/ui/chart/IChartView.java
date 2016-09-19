package client.ui.chart;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import org.moxieapps.gwt.highcharts.client.Series;

/**
 * Created by apoyark on 14.09.2016.
 */
public interface IChartView extends IsWidget {
    DecoratorPanel getBackgroundPanel();
    Button getAddPointButton();
    Series getExistSeries();
}
