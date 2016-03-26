public class StrongBehavior extends Decorator{
    //定义被修饰者
    public StrongBehavior(Swan _swan){
        super(_swan);
    }
    //定义自己的修饰方法
    private void canFly(){
        System.out.println("会飞行了");
    }
    //重写父类的fly方法
    public void fly(){
        this.canFly();
        //super.Fly();
    }
}
