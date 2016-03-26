public class Car implements ICar{
    //汽车引擎
    private String enging;
    //汽车车轮
    private String wheel;
    //一次性传递汽车需要的信息
    public Car(String _enging,String _wheel){
        this.enging = _enging;
        this.wheel  = _wheel;
    }
    public String getEnging(){
        return this.enging;
    }
    public String getWheel(){
        return this.wheel;
    }
    public String toString(){
        return "车的轮子是:"+this.wheel+"\n车的引擎是:"+this.enging;
    }
}
