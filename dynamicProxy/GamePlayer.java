package dynamicProxy;

public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(String name){
        this.name = name;
    }

    public void login(String username, String password) {
        System.out.println("登录名为 "+username+" 进入游戏，" + name + " 登录成功！");
    }

    public void killBoss() {
        System.out.println(this.name + " 击杀了Boss！");
    }

    public void upgrade(){
        System.out.println(this.name + "升级了！");
    }

}