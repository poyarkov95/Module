package client.ui.Page2;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by apoyark on 13.09.2016.
 */
public interface IPage2View  extends IsWidget{
    void addButton(Widget button);
    void deleteButton(Button button);
    DecoratorPanel getBackgroundPanel();

}
