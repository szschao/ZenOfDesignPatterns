/*
 *通过代理找到真实角色
 *屏蔽了真实角色GamePlayer的变更对高层角色Client的影响
 */
public class Client {
    public static void main(String args[]) {
        //定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy("张三");
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
