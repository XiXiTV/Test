package staticproxy;

public class HouseBuyer {
    public void buyHouseByStaticProxyForInterface() {
        //被代理对象：房主接口
        IHouseOwner iHouseOwner = new HouseOwner();
        //定义代理对象
        IHouseOwner houseAgent = new HouseAgentByStaticForInterface(iHouseOwner);
        //买房
        houseAgent.tradeHouse();
    }
}
