package CGLIB;

public class HouseAgentByDynamicForCglib implements MethodInterceptor {

    private HouseOwner owner;

    public HouseAgentByDynamicForCglib(HouseOwner owner) {
        this.owner = owner;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws InvocationTargetException, IllegalAccessException {
        //前置操作
        log.info("中介替购房者完成筛选房屋...最终选定了一间房。");

        //售房
        Object result = method.invoke(owner, args);

        //后置操作
        log.info("中介替购房者完成与房主签订的售房合同。");

        return result;
    }
}

