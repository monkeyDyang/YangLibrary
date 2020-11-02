import yy.SingleObject;

public class SingletonPattern {

    public static void main(String[] args) {

        // 无法实例化，构造方法是私有的
        //SingleObject singleObject = new SingleObject();

        SingleObject singleObject = SingleObject.getInstance();

        singleObject.Method();
    }
}
