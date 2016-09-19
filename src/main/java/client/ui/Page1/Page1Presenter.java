package client.ui.Page1;

import client.AppEventBus;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * Page view have a button. If you click it, on page2 creates new buttons.
 */
@Presenter(view = Page1View.class)
public class Page1Presenter extends BasePresenter<IPage1View, AppEventBus>{
    @Override
    public void bind() {
        view.getCheckBox().setValue(true);
        view.getAddButton().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                eventBus.addButton();

            }
        });
        view.getCheckBox().addValueChangeHandler(new ValueChangeHandler<Boolean>() {
            @Override
            public void onValueChange(ValueChangeEvent<Boolean> event) {
                if(event.getValue()){
                    eventBus.enableMOM();
                }
                else {
                    eventBus.disableMOM();
                }
            }
        });
    }
    public void onClickPanel(String data){
        if(!data.equals("1")){
            return;
        }
        eventBus.setPages(view.getBackgroundPanel());
    }

    public void onEnableMOM(){
        view.getAddButton().setEnabled(true);
    }
    public void onDisableMOM(){
        view.getAddButton().setEnabled(false);
    }}
