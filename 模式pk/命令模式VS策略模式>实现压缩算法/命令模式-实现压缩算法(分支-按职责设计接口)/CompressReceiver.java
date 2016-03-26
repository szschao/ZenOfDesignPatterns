public class CompressReceiver implements IReceiver{
    //执行gzip压缩命令
    public boolean gzipExec(String _source,String _to){
        System.out.println(_source+"--->"+_to+" Gzip压缩成功");
        return true;
    }
    //执行zip压缩命令
    public boolean zipExec(String _source,String _to){
        System.out.println(_source+"--->"+_to+" Zip压缩成功");
        return true;
    }
}
