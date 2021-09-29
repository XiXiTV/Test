package Farm;

public class A_Cattle implements Animal{

    public A_Cattle() {
        System.out.println("创建了一只牛");
    }

    @Override
    public void show() {
        System.out.println("我是牛牛");
    }
}
