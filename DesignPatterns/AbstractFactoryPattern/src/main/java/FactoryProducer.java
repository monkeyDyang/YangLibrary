import factory.AbstractFactory;
import factory.subfactory.AFactory;
import factory.subfactory.BFactory;

public class FactoryProducer {
    public AbstractFactory getFactory(String name){

        if (name == "AFactory")
            return new AFactory();
        else if (name == "BFactory")
            return new BFactory();
        else
            return null;
    }
}
