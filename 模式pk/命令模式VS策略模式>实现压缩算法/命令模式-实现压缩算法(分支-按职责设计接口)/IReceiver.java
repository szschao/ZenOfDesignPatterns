public interface IReceiver{
    //执行zip命令
    public boolean zipExec(String _source,String _to);
    //执行gzip命令
    public boolean gzipExec(String _source,String _to);
}
