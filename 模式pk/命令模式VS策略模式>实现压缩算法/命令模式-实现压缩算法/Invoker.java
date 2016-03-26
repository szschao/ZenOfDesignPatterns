public class Invoker{
    private AbstractCmd command;
    //受气包,接受命令
    public void setCommand(AbstractCmd _command){
        this.command = _command;
    }
    //执行命令
    public boolean action(String _source,String _to){
         return this.command.execute(_source,_to);
    }
}
