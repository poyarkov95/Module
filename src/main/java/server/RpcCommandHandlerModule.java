package server;

import net.customware.gwt.dispatch.server.guice.ActionHandlerModule;

/**
 * Created by apoyark on 15.09.2016.
 */
public class RpcCommandHandlerModule extends ActionHandlerModule {
    @Override
    protected void configureHandlers() {
        bindHandler(IncrementCounterHandler.class);
    }
}
