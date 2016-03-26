public abstract class Decorator extends IStar{
    private IStar star = null;
    //通过构造函数穿戴被修饰者
    public Decorator(IStar _star){
        this.star = _star;
    }
    //委托给被修饰者执行
    @Override
    public void act(){
        this.star.act();
    }
}
