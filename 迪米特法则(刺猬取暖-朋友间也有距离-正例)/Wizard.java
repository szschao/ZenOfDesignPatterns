import java.util.Random;

public class Wizard{
    //产生一个随机数,用来模拟操作的返回值
    private Random rand=new Random(System.currentTimeMillis());
    private int first(){
        System.out.println("执行第一个方法...");
        return rand.nextInt(100);
    }
    private int second(){
        System.out.println("执行第二个方法...");
        return rand.nextInt(100);
    }
    private int third(){
        System.out.println("执行第三个方法...");
        return rand.nextInt(100);
    }
    public void installWizard(){
        int first = this.first();
        if(first > 50){
            int sec = this.second();
            if(sec > 50){
                int thd = this.third();
            }
        }

    }
}
