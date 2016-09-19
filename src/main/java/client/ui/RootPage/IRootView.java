package client.ui.RootPage;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by apoyark on 13.09.2016.
 */
public interface IRootView extends IsWidget{
    void setPanel(Widget page);
    Button getButton1();
    Button getButton2();
    Button getChartButton();
}
