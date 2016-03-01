public class Client{
    public static void main(String[] args){
        IDriver zhangsan = new Driver();
        ICar acar=new Benz();
        //ICar acar=new BMW();
        //派给司机张三辆车,让他驾驶
        zhangsan.setCar(acar);
        zhangsan.driver();
    }
}
