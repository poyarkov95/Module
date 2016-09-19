package client.ui.RootPage;

import client.AppEventBus;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * Root view contains 3 "tabs". Click on it allows you to see some of choose pages.
 */
@Presenter(view = RootView.class)
public class RootPresenter extends BasePresenter<IRootView, AppEventBus> {

    public void onStart(){
        view.getButton1().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                eventBus.clickPanel("1");
            }
        });
        view.getButton2().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                eventBus.clickPanel("2");
            }
        });
        view.getChartButton().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                eventBus.clickPanel("3");
            }
        });
    }

    public void onSetPages(Widget page){
        view.setPanel(page);
    }
}
