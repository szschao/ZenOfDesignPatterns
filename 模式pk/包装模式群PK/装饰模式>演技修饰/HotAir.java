public class HotAir extends Decorator{
    //定义被修饰者
    public HotAir(IStar _star){
        super(_star);
    }
    //定义自己的修饰方法
    private void strechTruth(){
        System.out.println("演前:夸夸其谈,没有自己不能演的角色");
    }
    //重写父类的operate方法
    public void act(){
        this.strechTruth();
        super.act();
    }
}
