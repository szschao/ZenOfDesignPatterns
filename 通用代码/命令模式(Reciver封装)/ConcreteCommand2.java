public class ConcreteCommand2 extends Command{
    //声明自己的默认接收者
    public ConcreteCommand2(){
        super(new ConcreteReciver2());
    }
    //构造函数传递接收者
    public ConcreteCommand2(Receiver _receiver){
        super(_receiver);
    }
    //必须实现一个命令
    public void execute(){
        //业务处理
        super.receiver.doSomething();
    }
}
