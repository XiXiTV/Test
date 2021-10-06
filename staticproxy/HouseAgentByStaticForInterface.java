package staticproxy;

import java.util.logging.Logger;

public class HouseAgentByStaticForInterface implements IHouseOwner {

    private IHouseOwner owner;

    public HouseAgentByStaticForInterface(IHouseOwner owner) {
        this.owner = owner;
    }
    @Override
    public void tradeHouse(Logger log) {
        //前置操作
        log.info("中介替购房者完成筛选房屋...最终选定了一间房。");

        //售房
        owner.tradeHouse(log);

        //后置操作
        log.info("中介替购房者完成与房主签订的售房合同。");
    }
}

