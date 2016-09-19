package server;

import net.customware.gwt.dispatch.server.ActionHandler;
import net.customware.gwt.dispatch.server.ExecutionContext;
import net.customware.gwt.dispatch.shared.ActionException;
import shared.IncrementCounter;
import shared.IncrementCounterResult;

/**
 * Our handler increments field in action and returns it in result class.
 */
public class IncrementCounterHandler implements ActionHandler<IncrementCounter, IncrementCounterResult> {
    private int current = 0;


    public Class<IncrementCounter> getActionType() {
        return IncrementCounter.class;
    }


    public IncrementCounterResult execute(IncrementCounter action, ExecutionContext context) throws ActionException {
        current += action.getAmount();
        return new IncrementCounterResult(action.getAmount(), current);
    }


    public void rollback(IncrementCounter action, IncrementCounterResult result, ExecutionContext context) throws ActionException {
        current = result.getCurrent() - result.getAmount();
    }
}
