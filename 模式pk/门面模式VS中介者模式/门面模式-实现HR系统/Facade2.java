//模块二是受限访问对象,只能访问方法B
public class Facade2{
    //引用原有的门面
    private Facade facade = new Facade();
    //对外提供唯一的访问子系统的方法
    public void methodB(){
        this.facade.methodB();
    }
}
