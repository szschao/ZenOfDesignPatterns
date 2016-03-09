public class ShanZhaiCorp extends Corp{
    //产什么产品,不知道,等调用的才知道
    public ShanZhaiCorp(Product _product){
        super(_product);
    }
    //狂赚钱
    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}
