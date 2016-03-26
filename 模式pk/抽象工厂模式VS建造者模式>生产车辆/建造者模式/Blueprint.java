//生产蓝图.与产品Car类不一样,它是一个可以参考的模板
public class Blueprint{
    //车轮的要求
    private String wheel;
    //引擎的要求
    private String enging;
    public String getWheel(){
        return wheel;
    }
    public void setWheel(String _wheel){
        this.wheel=_wheel;
    }
    public String getEnging(){
        return enging;
    }
    public void setEnging(String _enging){
        this.enging=_enging;
    }
}
