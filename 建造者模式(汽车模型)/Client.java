import java.util.ArrayList;
public class Client {
    public static void main(String args[]) {
        BenzModel benz = new BenzModel();
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        //我们把这个顺序赋于奔驰车
        benz.setSequence(sequence);
        benz.run();
    }
}
