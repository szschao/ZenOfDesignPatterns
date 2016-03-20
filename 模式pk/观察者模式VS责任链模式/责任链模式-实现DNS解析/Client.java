import java.io.BufferedReader;
import java.io.InputStreamReader;

class Client {
    public static void main(String args[]) throws Exception {
        //声明所有的处理节点
        DnsServer sh = new SHDnsServer();
        DnsServer china = new ChinaTopDnsServer();
        DnsServer top = new TopDnsServer();
        //设置链中的阶段顺序1-->2-->3
        sh.setUpperServer(china);
        china.setUpperServer(top);
        //解析域名
        System.out.println("====域名解析模拟器====");
        while(true){
            System.out.println("\n请输入域名(输入N退出):");
            String domain = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if(domain.equalsIgnoreCase("n")){
                return;
            }
            Recorder recorder = sh.resolver(domain);
            System.out.println("----DNS服务器解析结果----");
            System.out.println(recorder);
        }
    }
}
