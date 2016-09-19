package client.ui.Page2;

import client.AppEventBus;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * When page1 create at least 1 button, you can click on it and button disappears
 */
@Presenter(view = Page2View.class)
public class Page2Presenter extends BasePresenter<IPage2View, AppEventBus>{
    public void onAddButton(){
        view.addButton(new Button("Click me!!!", new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                eventBus.deleteSomeButton((Button)clickEvent.getSource());
            }
        }));
    }
    public void onClickPanel(String data){
        if(!data.equals("2")){
            return;
        }
        eventBus.setPages(view.getBackgroundPanel());
    }
    public void onDeleteSomeButton(Button killerButton){
        view.deleteButton(killerButton);
    }

}
