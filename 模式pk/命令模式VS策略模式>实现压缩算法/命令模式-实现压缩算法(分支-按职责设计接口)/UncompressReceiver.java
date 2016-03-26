public class UncompressReceiver implements IReceiver{
    //执行gzip的解压命令
    public boolean gzipExec(String _source,String _to){
        System.out.println(_source+"--->"+_to+" Gzip解压成功");
        return true;
    }
    //执行zip的解压命令
    public boolean zipExec(String _source,String _to){
        System.out.println(_source+"--->"+_to+" Zip解压成功");
        return true;
    }
}
