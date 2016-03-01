import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
public class Client {
    public static void main(String[] args) throws Throwable{
        //定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        //定义一个handler
        InvocationHandler handler = new GamePlayIH(player);
        //开始打游戏,记下时间戳
        System.out.println("开始时间是:2016-02-17 22:24");
        //获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
        //动态产生一个代理
        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class},handler);
        //登陆
        proxy.login("zhangSan","password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是:2016-02-17 23:41");
    }
}
