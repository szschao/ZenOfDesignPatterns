//最大实例化数量可以通过Map已有的对象数量来实现
public class Client {
    public static void main(String args[]) {
        try{
            ProductFactory productFactory = new ProductFactory();
            Product product = productFactory.createProduct("Product1");
            product.method2();

            product = productFactory.createProduct("Product2");
            product.method2();
        }catch(Exception e){
            //异常处理
        }
    }
}
