package server;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

/**
 * Created by apoyark on 15.09.2016.
 */
public class RpcCommandGuiceConfig extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new RpcCommandHandlerModule(), new DispatcherServletModule());
    }
}
