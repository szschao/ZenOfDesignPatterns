import java.util.Arrays;

//运行的时候需要单独在控制台输入以下命名:
//java Client 4 + 3
class Client {
    public static void main(String args[]) {
        System.out.println(args[0]);
        //输入两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为:"+Arrays.toString(args));
        //Calculator.ADD.exec(a,b)
        //真实的面向对象:拿出计算器Calculator,对a和b进行加法运算(ADD),立即执行exec
        System.out.println("运行结果:"+a+symbol+b+"="+Calculator.ADD.exec(a,b));
    }
}
