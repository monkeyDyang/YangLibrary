package factory;

import product.a.ProductA;
import product.b.ProductB;

public abstract class AbstractFactory {

    public abstract ProductA getProductA(String flag);
    public abstract ProductB getProductB(String flag);
    //... N个工厂，同时需要写N个实现类继承抽象工厂
    // 如果工厂

}
