/*
 *调用者知道GamePlayer这个真实角色,不利扩展
 */
public class Client {
    public static void main(String args[]) {
        //定义一个痴迷玩家
        IGamePlayer player = new GamePlayer("张三");
        //定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(player);
        //开始打游戏,记下时间戳
        System.out.println("开始时间是:2016-02-16 10:47");
        proxy.login("张三","password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是:2016-02-16 15:40");
    }
}
