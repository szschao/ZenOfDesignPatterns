//创建产品是由具体的实现类完成
public class Creator1 extends AbstractCreator{
    //只生产产品等级为1的A产品
    public AbstractProductA createProductA(){
        return new ProductA1();
    }
    //只生产产品等级为1的B产品
    public AbstractProductB createProductB(){
        return new ProductB1();
    }
}
