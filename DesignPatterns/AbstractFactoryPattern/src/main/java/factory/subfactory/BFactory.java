package factory.subfactory;

import factory.AbstractFactory;
import product.a.ProductA;
import product.b.ProductB;
import product.b.impl.BOne;
import product.b.impl.BTwo;

public class BFactory extends AbstractFactory {
    public ProductA getProductA(String flag) {
        return null;
    }

    public ProductB getProductB(String flag) {
        if (flag == "BOne")
            return new BOne();
        else if (flag == "AOne")
            return new BTwo();
        else
            return null;
    }
}
