//原有的基础上增加Invoker类,作用是根据客户的命令安排不同的组员进行工作
public class Invoker{
    //什么命令
    private Command command;
    //客户发出命令
    public void setCommand(Command _command){
        this.command = _command;
    }

    //执行客户命令
    public void action(){
        this.command.execute();
    }
}
