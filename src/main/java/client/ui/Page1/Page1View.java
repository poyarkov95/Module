package client.ui.Page1;

import client.ReverseCompositeView;
import com.google.gwt.user.client.ui.*;

/**
 * Created by apoyark on 13.09.2016.
 */
public class Page1View extends Composite implements IPage1View{

    private Button addButton;
    private CheckBox checkBox;

    public DecoratorPanel getBackgroundPanel() {
        return backgroundPanel;
    }

    private DecoratorPanel backgroundPanel;

    Page1View(){
        backgroundPanel = new DecoratorPanel();
        addButton = new Button("Add new button");
        addButton.addStyleName("button");
        checkBox = new CheckBox("Enable adding new buttons");
        VerticalPanel content = new VerticalPanel();
        content.setSize("400px","400px");
        content.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        content.add(addButton);
        content.add(checkBox);
        backgroundPanel.add(content);
    }

    @Override
    public Button getAddButton() {
        return addButton;
    }

    @Override
    public CheckBox getCheckBox() {
        return checkBox;
    }
}
