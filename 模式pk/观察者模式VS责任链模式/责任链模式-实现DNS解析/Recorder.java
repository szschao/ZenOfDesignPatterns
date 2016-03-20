public class Recorder{
    //域名
    private String domain;
    //IP地址
    private String ip;
    //属主
    private String owner;

    public String getDomain(){
        return domain;
    }
    public void setDomain(String _domain){
        this.domain = _domain;
    }
    public String getIp(){
        return ip;
    }
    public void setIp(String _ip){
        this.ip = _ip;
    }
    public String getOwner(){
        return owner;
    }
    public void setOwner(String _owner){
        this.owner = _owner;
    }
    //输出记录信息
    @Override
    public String toString(){
        String str = "域名: " + this.domain;
        str = str +"\nIP地址: " + this.ip;
        str = str +"\n解析者: " + this.owner;
        return str;
    }
}
