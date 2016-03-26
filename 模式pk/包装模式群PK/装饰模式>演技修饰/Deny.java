public class Deny extends Decorator{
    //定义被修饰者
    public Deny(IStar _star){
        super(_star);
    }
    //定义自己的修饰方法
    private void disavow(){
        System.out.println("演后:百般抵赖,死不承认");
    }
    //重写父类的operate方法
    public void act(){
        super.act();
        this.disavow();
    }
}
