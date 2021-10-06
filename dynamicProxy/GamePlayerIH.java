package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class GamePlayerIH implements InvocationHandler
{
    private Object object;

    public GamePlayerIH(Object object)
    {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("开始游戏时间：" + new Date());

        Object result = method.invoke(this.object,args);
        if(method.getName().equals("login"))
        {
            System.out.println("有人登录我的帐号");
        }

        System.out.println("结束游戏时间：" + new Date());
        return result;
    }
}