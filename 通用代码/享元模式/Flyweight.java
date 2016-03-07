public abstract class Flyweight{
    //内部状态
    private String intrinsic; //可以没有内部(只有行为也是可以的)
    //外部状态
    protected final String Extrinsic;
    //要求享元角色必须接受外部状态
    public Flyweight(String _extinsic){
        this.Extrinsic = _extinsic;
    }
    //定义业务操作
    public abstract void operate();
    //内部状态的getter/setter
    public String getIntrinsic(){
        return intrinsic;
    }
    public void setIntrinsic(String _intrinsic){
        this.intrinsic = _intrinsic;
    }
}
