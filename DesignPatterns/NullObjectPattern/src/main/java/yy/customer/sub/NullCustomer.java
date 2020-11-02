package yy.customer.sub;

import yy.customer.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {
    protected Boolean isNil() {
        return true;
    }

    public String getName() {
        return "Not Available in Customer Database";
    }
}
