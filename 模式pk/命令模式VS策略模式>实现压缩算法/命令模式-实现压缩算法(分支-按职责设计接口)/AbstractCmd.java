public abstract class AbstractCmd{
    //定义一个子类的全局共享变量
    protected final IReceiver receiver;
    //实现必须定义一个接收者
    public AbstractCmd(IReceiver _receiver){
        this.receiver = _receiver;
    }
    //抽象方法,命令的具体单元
    public abstract boolean execute(String _source,String _to);
}
