public abstract class Decorator implements IRunner{
    private IRunner runner = null;
    //通过构造函数穿戴被修饰者
    public Decorator(IRunner _runner){
        this.runner = _runner;
    }
    //委托给被修饰者执行
    public void run(){
        this.runner.run();
    }
}
