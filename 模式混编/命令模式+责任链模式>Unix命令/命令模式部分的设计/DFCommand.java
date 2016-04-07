public class DFCommand extends Command{
    //声明自己的默认接收者
    public DFCommand(){
        super(new CommandVO());
    }
    //构造函数传递接收者
    public DFCommand(Receiver _receiver){
        super(_receiver);
    }
    //必须实现一个命令
    public void execute(){
        //业务处理
        super.vo.doSomething();
    }
}
