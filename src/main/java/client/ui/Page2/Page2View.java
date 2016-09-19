package client.ui.Page2;

import client.ReverseCompositeView;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Singleton;

/**
 * Created by apoyark on 13.09.2016.
 */
@Singleton
public class Page2View extends Composite implements IPage2View {
    private VerticalPanel buttonsPlacement;

    public DecoratorPanel getBackgroundPanel() {
        return panel;
    }

    private DecoratorPanel panel;

    Page2View(){

        panel = new DecoratorPanel();
        buttonsPlacement = new VerticalPanel();
        buttonsPlacement.setSize("400px","400px");
        buttonsPlacement.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        panel.add(buttonsPlacement);
    }


    @Override
    public void addButton(Widget button) {
        buttonsPlacement.add(button);
    }

    @Override
    public void deleteButton(Button button) {
        if(buttonsPlacement.getWidgetCount() != 0){
            int deleteIndex = Random.nextInt(buttonsPlacement.getWidgetCount());
            buttonsPlacement.remove(deleteIndex);
            button.setText("Killer!!!");
            button.addStyleName("kill-button");
        }
    }
}
