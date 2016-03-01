/*
 *通过真实角色查找到代理角色(返回代理,除了这个代理外谁都不能访问)
 *Example:你和一个明星比较熟
 *"喂,沙比呀,我要见一下xxx导演,你帮下忙"
 *"不行呀衰哥,我这几天很忙呀,你找我的经纪人吧..."
 *你不能随便找个经纪人,你得着沙比指定的经纪人
 */
public class Client {
    public static void main(String args[]) {
        //定义一个痴迷玩家
        IGamePlayer player = new GamePlayer("张三");
        //获得指定的代理
        IGamePlayer proxy = player.getProxy();
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
