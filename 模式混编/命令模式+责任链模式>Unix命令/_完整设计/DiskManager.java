//可以通过JNI的方式或执行操作系统的命令的方式获得
public class DiskManager{
    //df命令
    public static String df(String path){
        return "/\t10485760\n/usr\t104856400\n/home\t1048566000\n";
    }
    //df -k 命令(按照kb计算)
    public static String df_k(String path){
        return "\t10240\n/usr\t102400\n/home\tt10240000\n";
    }
    //df -g命令
    public static String df_g(String path){
        return "/\t10\n/usr\t100\nhome\tt10000\n";
    }
}
