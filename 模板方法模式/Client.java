public class Client {
    public static void main(String args[]) {
        //XX公司要H1型号的悍马
        HummerModel h1 = new HummerH1Model();
        //H1模型演示
        h1.run();

        //H2型号的悍马
        HummerModel h2 = new HummerH2Model();
        //H2模型演示
        h2.run();
    }
}
