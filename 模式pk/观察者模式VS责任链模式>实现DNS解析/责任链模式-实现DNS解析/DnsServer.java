import java.util.Random;

public abstract class DnsServer{
    //上级DNS是谁
    private DnsServer upperServer;
    //域名解析
    public final Recorder resolver(String _domain){
        Recorder response = null;
        //判断是否是自己的处理级别
        if(isLocal(_domain)){
            response = this.echo(_domain);
        }else{
            //不属于自己的处理级别
            //判断是否有下一个处理
            if(this.upperServer != null){
                //是本服务器能解析的域名
                response = this.upperServer.resolver(_domain);
            }else{
                //提交上级DNS进行解析
                response = upperServer.resolver(_domain);
            }
        }
        return response;
    }
    //设置下一个处理者是谁
    public void setUpperServer(DnsServer _upperServer){
        this.upperServer = _upperServer;
    }
    //每个处理者都有一个数据处理区(ZONE),检查域名是否在本区域中
    protected abstract boolean isLocal(String _domain);
    //每个处理者都必粗实现解析任务
    protected Recorder echo(String _domain){
        Recorder recorder = new Recorder();
        //获得IP地址
        recorder.setIp(genIpAddress());
        recorder.setDomain(_domain);
        return recorder;
    }
    //随机产生一个IP地址,工具类
    private String genIpAddress(){
        Random rand = new Random();
        String address = rand.nextInt(255)+"."+rand.nextInt(255)+"."+rand.nextInt(255)+"."+rand.nextInt(255);
        return address;
    }
}
