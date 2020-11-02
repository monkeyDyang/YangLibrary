package yy.customer.sub;

import yy.customer.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name){
        this.name = name;
    }

    protected Boolean isNil() {
        return false;
    }

    public String getName() {
        return name;
    }
}
