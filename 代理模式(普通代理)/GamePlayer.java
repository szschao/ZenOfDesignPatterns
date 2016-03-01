public class GamePlayer implements IGamePlayer{
    private String name = "";
    //通过构造函数传递名称
    public GamePlayer(IGamePlayer _gamePlayer,String _name) throws Exception{
        if(_gamePlayer == null){
            throw new Exception("不能创建真实角色!");
        }else{
            this.name = _name;
        }
    }
    //打怪,最期望的是杀老怪
    public void killBoss(){
        System.out.println(this.name + "在打怪!");
    }
    //进游戏前肯定要登陆
    public void login(String user,String password){
        System.out.println("登录名为"+user+"的用户"+this.name+"登陆成功");
    }
    //升级
    public void upgrade(){
        System.out.println(this.name+"又升了一级");
    }
}
