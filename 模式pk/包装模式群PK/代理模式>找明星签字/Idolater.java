public class Idolater {
    public static void main(String args[]) {
        //找到明星的经纪人
        IStar agent = new Agent();
        System.out.println("追星族:我是你的崇拜者,请签名!");
        //签字(真实签名的人是明星,经纪人只是把这个请求传递给明星处理而已)
        agent.sign();
    }
}
