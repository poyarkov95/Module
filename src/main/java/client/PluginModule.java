package client;

import client.ui.Page1.IPage1View;
import client.ui.Page1.Page1View;
import client.ui.Page2.IPage2View;
import client.ui.Page2.Page2View;
import client.ui.RootPage.IRootView;
import client.ui.RootPage.RootView;
import client.ui.chart.ChartView;
import client.ui.chart.IChartView;
import com.google.gwt.inject.client.AbstractGinModule;

/**
 * Created by apoyark on 14.09.2016.
 */
public class PluginModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(IPage1View.class).to(Page1View.class);
        bind(IPage2View.class).to(Page2View.class);
        bind(IChartView.class).to(ChartView.class);
        bind(IRootView.class).to(RootView.class);

    }
}
