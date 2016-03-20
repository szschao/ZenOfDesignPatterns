public class GzipCompressCmd extends AbstractCmd{
    //声明自己的默认接收者
    public GzipCompressCmd(){
        super(new CompressReceiver());
    }
    //构造函数传递接收者
    public GzipCompressCmd(IReceiver _receiver){
        super(_receiver);
    }
    //必须实现一个命令
    public boolean execute(String _source,String _to){
        //业务处理
        return super.receiver.gzipExec(_source,_to);
    }
}
