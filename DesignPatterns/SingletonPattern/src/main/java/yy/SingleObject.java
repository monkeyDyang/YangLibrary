package yy;

public class SingleObject {

    private static SingleObject intance = new SingleObject();

    private SingleObject(){
        //私有化构造方法，防止被其他类实例化
    }

    public static SingleObject getInstance(){
        return intance;
    }

    public void Method(){
        System.out.println("this is a singleClass");
    }
}
