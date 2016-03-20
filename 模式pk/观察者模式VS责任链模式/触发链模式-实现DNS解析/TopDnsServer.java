public class TopDnsServer extends DnsServer{
    @Override
    protected void sign(Recorder recorder){
        recorder.setOwner("全球顶级DNS服务器");
    }
    //定义上海的DNS服务器能处理的级别
    @Override
    protected boolean isLocal(Recorder recorder){
        return true;
    }
}
