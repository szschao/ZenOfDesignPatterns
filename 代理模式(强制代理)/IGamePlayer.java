public interface IGamePlayer{
    //登陆游戏
    public void login(String user,String password);
    //杀怪
    public void killBoss();
    //升级
    public void upgrade();
    //每个人都可以指定自己的代理
    public IGamePlayer getProxy();
}
