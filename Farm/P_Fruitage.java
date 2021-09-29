package Farm;

public class P_Fruitage implements Plant{
    public P_Fruitage() {
        System.out.println("创建了一个水果");
    }

    @Override
    public void show() {
        System.out.println("我是水果");
    }
}
