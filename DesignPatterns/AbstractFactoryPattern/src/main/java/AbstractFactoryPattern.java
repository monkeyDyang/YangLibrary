import factory.AbstractFactory;
import product.a.ProductA;

public class AbstractFactoryPattern {
    public static void main(String[] args) {

        //实例化FactoryProducer
        FactoryProducer producer = new FactoryProducer();

        //生产AOne
        //1.获得A工厂
        AbstractFactory factory = producer.getFactory("AFactory");
        //2.生产AOne
        ProductA a = factory.getProductA("AOne");
        //3.使用AOne
        a.MethodA();

        //生产BTwo
        //....
    }
}
