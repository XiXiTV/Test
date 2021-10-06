package JDKproxy;

public class HouseAgentByDynamicForJdk implements InvocationHandler {
    /**
     * 被代理的对象：房主
     */
    private IHouseOwner owner;

    public HouseAgentByDynamicForJdk(IHouseOwner owner) {
        this.owner = owner;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //前置操作
        log.info("中介替购房者完成筛选房屋...最终选定了一间房。");

        //售房
        Object result = method.invoke(owner, args);

        //后置操作
        log.info("中介替购房者完成与房主签订的售房合同。");

        return result;
    }
}
