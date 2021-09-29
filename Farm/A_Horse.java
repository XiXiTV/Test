package Farm;

public class A_Horse implements Animal{
    public A_Horse() {
        System.out.println("创造了一只马");
    }

    @Override
    public void show() {
        System.out.println("我是马马");
    }
}
