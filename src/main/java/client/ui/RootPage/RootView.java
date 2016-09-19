package client.ui.RootPage;

import client.ReverseCompositeView;
import client.ui.Page2.IPage2View;
import com.google.gwt.user.client.ui.*;

/**
 * Created by apoyark on 13.09.2016.
 */
public class RootView extends Composite implements IRootView {
    private VerticalPanel rootPanel;
    private HorizontalPanel buttonsPanel;
    private Button button1;
    private Button button2;
    private Button chartButton;
    private FlowPanel content;

    public RootView(){
        //Our root panel with buttons and content
        rootPanel = new VerticalPanel();

        //Buttons panel
        buttonsPanel = new HorizontalPanel();
        button1 = new Button("Edit page1");
        button2 = new Button("Edit page2");
        chartButton = new Button("Edit chart");

        button1.addStyleName("button");
        button2.addStyleName("button");
        chartButton.addStyleName("button");

        buttonsPanel.add(button1);
        buttonsPanel.add(button2);
        buttonsPanel.add(chartButton);

        //Edit
        content = new FlowPanel();
        rootPanel.add(buttonsPanel);
        rootPanel.add(content);
        RootPanel.get().add(rootPanel);
    }

    @Override
    public void setPanel(Widget page) {
        content.add(page);
    }

    public Button getButton2() {
        return button2;
    }

    public Button getButton1() {
        return button1;
    }

    public Button getChartButton() {
        return chartButton;
    }
}
