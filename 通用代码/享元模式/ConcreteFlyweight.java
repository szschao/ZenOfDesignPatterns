public class ConcreteFlyweight extends Flyweight{
    //接受外部状态
    public ConcreteFlyweight(String _extinsic){
        super(_extinsic);
    }
    //根据外部状态进行逻辑处理
    public void operate(){
        //业务逻辑
    }
}
