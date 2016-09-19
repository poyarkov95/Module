package shared;

import net.customware.gwt.dispatch.shared.Result;

/**
 * Our result
 */
@SuppressWarnings("serial")
public class IncrementCounterResult implements Result {
    private int amount;
    private int current;

    /** For serialization only. */
    public IncrementCounterResult(){}

    public IncrementCounterResult(int amount, int current){
        this.amount = amount;
        this.current = current;
    }

    public int getAmount() {
        return amount;
    }

    public int getCurrent() {
        return current;
    }
}
