public class ChinaTopDnsServer extends DnsServer{
    @Override
    //定义自己的处理逻辑
    protected Recorder echo(String _domain){
        Recorder recorder = super.echo(_domain);
        recorder.setOwner("中国顶级DNS服务器");
        return recorder;
    }
    //定义上海的DNS服务器能处理的级别
    @Override
    protected boolean isLocal(String _domain){
        return _domain.endsWith(".cn");
    }
}
