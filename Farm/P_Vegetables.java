package Farm;

public class P_Vegetables implements Plant{
    public P_Vegetables() {
        System.out.println("创建了一个蔬菜");
    }

    @Override
    public void show() {
        System.out.println("我是蔬菜");
    }
}
