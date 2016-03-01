public class Client{
    public static void main(String[] args){
        IDriver zhangsan = new Driver();
        //ICar acar=new Benz();
        ICar acar=new BMW();
        //司机张三驾驶了辆找来的车
        zhangsan.driver(acar);
    }
}
