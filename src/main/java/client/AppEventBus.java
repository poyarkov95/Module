package client;

import client.ui.Page1.Page1Presenter;
import client.ui.Page1.Page1View;
import client.ui.Page2.Page2Presenter;
import client.ui.Page2.Page2View;
import client.ui.RootPage.RootPresenter;
import client.ui.chart.ChartPresenter;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.annotation.Start;
import com.mvp4g.client.event.EventBus;

/**
 * Created by apoyark on 13.09.2016.
 */
@Events(startPresenter = RootPresenter.class, ginModules = PluginModule.class)
public interface AppEventBus extends EventBus {

    @Start
    @Event(bind = {Page1Presenter.class, Page2Presenter.class, ChartPresenter.class}, handlers = RootPresenter.class)
    void start();

    @Event(handlers = {Page1Presenter.class}, activate = Page2Presenter.class)
    void enableMOM();

    @Event(handlers = {Page1Presenter.class}, deactivate = Page2Presenter.class)
    void disableMOM();

    @Event(handlers = Page2Presenter.class)
    void addButton();

    @Event(handlers = Page2Presenter.class)
    void deleteSomeButton(Button killerButton);

    @Event(handlers = RootPresenter.class)
    void setPages(Widget page);

    @Event(handlers = {Page1Presenter.class, Page2Presenter.class, ChartPresenter.class})
    void clickPanel(String data);

    @Event(handlers = ChartPresenter.class)
    void addNewPoint();
}
