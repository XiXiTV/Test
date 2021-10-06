package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerInvocationHandler implements InvocationHandler{

    //被代理的对象
    private Object obj;

    //将需要代理的实例通过处理器类的构造方法传递给代理。
    public GamePlayerInvocationHandler(Object obj){
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object result = null;
        if("login".equalsIgnoreCase(method.getName())){
            System.out.println("代理登录游戏！");
            result = method.invoke(this.obj, args);
            return result;
        }
        result = method.invoke(this.obj, args);
        return result;
    }

}