package shared;

import net.customware.gwt.dispatch.shared.Action;

/**
 * Our action
 */
@SuppressWarnings("serial")
public class IncrementCounter implements Action<IncrementCounterResult> {
    private int amount;

    /** For serialization only. */
    public IncrementCounter(){}

    public IncrementCounter(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
