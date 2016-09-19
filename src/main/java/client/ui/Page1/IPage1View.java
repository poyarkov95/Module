package client.ui.Page1;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.IsWidget;

/**
 * Created by apoyark on 13.09.2016.
 */
public interface IPage1View extends IsWidget {
    Button getAddButton();

    CheckBox getCheckBox();

    DecoratorPanel getBackgroundPanel();

}
