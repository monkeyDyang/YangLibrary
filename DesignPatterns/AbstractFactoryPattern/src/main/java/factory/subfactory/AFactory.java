package factory.subfactory;

import factory.AbstractFactory;
import product.a.ProductA;
import product.a.impl.AOne;
import product.a.impl.ATwo;
import product.b.ProductB;

public class AFactory extends AbstractFactory {

    //A类工厂负责生产A类产品，对B类产品不做相应

    public ProductA getProductA(String flag) {

        if (flag == "AOne")
            return new AOne();
        else if (flag == "AOne")
            return new ATwo();
        else
            return null;
    }

    public ProductB getProductB(String flag) {

        return null;
    }

}
