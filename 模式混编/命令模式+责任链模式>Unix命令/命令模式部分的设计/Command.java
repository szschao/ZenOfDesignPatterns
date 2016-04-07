public abstract class Command{
    //定义一个子类的全局共享变量
    protected final Receiver vo;
    //实现必须定义一个接收者
    public Command(Receiver _vo){
        this.vo = _vo;
    }
    //每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
