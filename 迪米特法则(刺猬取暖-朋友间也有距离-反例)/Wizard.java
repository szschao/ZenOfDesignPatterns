import java.util.Random;

public class Wizard{
    //产生一个随机数,用来模拟操作的返回值
    private Random rand=new Random(System.currentTimeMillis());
    public int first(){
        System.out.println("执行第一个方法...");
        return rand.nextInt(100);
    }
    public int second(){
        System.out.println("执行第二个方法...");
        return rand.nextInt(100);
    }
    public int third(){
        System.out.println("执行第三个方法...");
        return rand.nextInt(100);
    }

}
