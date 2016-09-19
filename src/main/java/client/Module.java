package client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.*;
import com.mvp4g.client.Mvp4gModule;

/**
 * Created by apoyark on 13.09.2016.
 */
public class Module implements EntryPoint {
    public void onModuleLoad() {
        Mvp4gModule module = GWT.create(Mvp4gModule.class);
        module.createAndStartModule();
    }
}
