import java.util.ArrayList;
public class Client {
    public static void main(String args[]) {
        Director director = new Director();

        System.out.println("车辆类型A");
        director.getABenzModel().run();
        System.out.println("\n车辆类型B");
        director.getBBenzModel().run();
        System.out.println("\n车辆类型C");
        director.getCBMWModel().run();
    }
}
