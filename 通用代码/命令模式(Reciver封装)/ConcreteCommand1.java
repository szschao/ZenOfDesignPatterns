public class ConcreteCommand1 extends Command{
    //声明自己的默认接收者
    public ConcreteCommand1(){
        super(new ConcreteReciver1());
    }
    //构造函数传递接收者
    public ConcreteCommand1(Receiver _receiver){
        super(_receiver);
    }
    //必须实现一个命令
    public void execute(){
        //业务处理
        this.receiver.doSomething();
    }
}
