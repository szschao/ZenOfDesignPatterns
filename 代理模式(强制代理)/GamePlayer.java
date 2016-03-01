public class GamePlayer implements IGamePlayer{
    private String name = "";
    //我的代理是谁
    private IGamePlayer proxy = null;
    //通过构造函数传递名称
    public GamePlayer(String _name){
        this.name = _name;
    }
    //找到自己的代理
    public IGamePlayer getProxy(){
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }
    //打怪,最期望的是杀老怪
    public void killBoss(){
        if(this.isProxy()){
            System.out.println(this.name + "在打怪!");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }
    //进游戏前肯定要登陆
    public void login(String user,String password){
        if(this.isProxy()){
            System.out.println("登录名为"+user+"的用户"+this.name+"登陆成功");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }
    //升级
    public void upgrade(){
        if(this.isProxy()){
            System.out.println(this.name+"又升了一级");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }
    //检验是否是代理访问
    private boolean isProxy(){
        if(this.proxy == null){
            return false;
        }else{
            return true;
        }
    }
}
