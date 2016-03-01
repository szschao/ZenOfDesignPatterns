//创建产品是由具体的实现类完成
public class Creator2 extends AbstractCreator{
    //只生产产品等级为2的A产品
    public AbstractProductA createProductA(){
        return new ProductA2();
    }
    //只生产产品等级为2的B产品
    public AbstractProductB createProductB(){
        return new ProductB2();
    }
}
