public class Client{
    public static void main(String[] args){
        ICar acar=new Benz();
        //ICar acar=new BMW();
        //司机张三买车(司机拥有),并驾驶着
        IDriver zhangsan = new Driver(acar);
        zhangsan.driver();
    }
}
