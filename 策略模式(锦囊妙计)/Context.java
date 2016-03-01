//三个妙计都要放到锦囊中,Context就是锦囊
public class Context{
    //构造函数你要使用哪个锦囊
    private IStrategy strategy = null;
    public Context(IStrategy _strategy){
        this.strategy = _strategy;
    }
    //使用计谋了,看我出招
    public void operate(){
        this.strategy.operate();
    }
}
