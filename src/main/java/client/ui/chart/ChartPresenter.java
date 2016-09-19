package client.ui.chart;

import client.AppEventBus;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import net.customware.gwt.dispatch.client.DefaultDispatchAsync;
import net.customware.gwt.dispatch.client.DispatchAsync;
import org.moxieapps.gwt.highcharts.client.Point;
import org.moxieapps.gwt.highcharts.client.Series;
import shared.IncrementCounter;
import shared.IncrementCounterResult;

/**
 * Created by apoyark on 14.09.2016.
 */
//View for chart
@Presenter(view = ChartView.class)
public class ChartPresenter extends BasePresenter<IChartView, AppEventBus>{


    private DispatchAsync dispatch = new DefaultDispatchAsync();

    @Override
    public void bind() {
        view.getAddPointButton().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                eventBus.addNewPoint();
            }
        });
    }
//on the server, we have a handler that increments the field  in action class.
//IncrementCounter.class - action IncrementCounterResult - result and IncrementCounterHandler
    public void onAddNewPoint(){
        dispatch.execute(new IncrementCounter(1), new AsyncCallback<IncrementCounterResult>() {
            @Override
            public void onFailure(Throwable throwable) {
                Window.alert("Feels bad man");
            }
//when you click the button on the chart it creates new point
            @Override
            public void onSuccess(IncrementCounterResult result) {
                Series series = view.getExistSeries();
                series.addPoint(new Point("Another one", result.getCurrent() + 10));
            }
        });
    }

    public void onClickPanel(String data){
        if(!data.equals("3")){
            return;
        }
        eventBus.setPages(view.getBackgroundPanel());
    }
}
