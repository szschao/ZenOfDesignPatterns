public class Client {
    public static void main(String args[]) {
        //定义两个工厂
        AbstractCreator creator1=new Creator1();
        AbstractCreator creator2=new Creator2();
        //生产A1对象
        AbstractProductA a1=creator1.createProductA();
        //生产A2对象
        AbstractProductA a2=creator1.createProductA();
        //生产B1对象
        AbstractProductB b1=creator1.createProductB();
        //生产B2对象
        AbstractProductB b2=creator1.createProductB();
    }
}
