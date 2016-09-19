package server;

import com.google.inject.Singleton;
import com.google.inject.servlet.ServletModule;
import net.customware.gwt.dispatch.server.service.DispatchServiceServlet;

/**
 * Created by apoyark on 15.09.2016.
 */
@Singleton
public class DispatcherServletModule extends ServletModule {
    @Override
    protected void configureServlets() {
        serve("/Module/dispatch").with(DispatchServiceServlet.class);

    }
}
