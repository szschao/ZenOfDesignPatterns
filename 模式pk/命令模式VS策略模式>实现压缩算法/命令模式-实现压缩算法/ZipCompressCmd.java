public class ZipCompressCmd extends AbstractCmd{
    //声明自己的默认接收者
    public ZipCompressCmd(){
        super(new ZipReciver());
    }
    //构造函数传递接收者
    public ZipCompressCmd(IReceiver _receiver){
        super(_receiver);
    }
    //必须实现一个命令
    public boolean execute(String _source,String _to){
        //业务处理
        return super.receiver.compress(_source,_to);
    }
}
