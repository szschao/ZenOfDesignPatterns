import java.util.ArrayList;
import java.util.HashSet;

//解析一个命令
//规定一个命令必须有3项:命令名,选项,操作数
//如果没有,就以长度为零的字符串代理
public class CommandVO{
    //定义参数名与参数的分隔符号
    public final static String DIVIDE_FLAG = " ";
    //定义参数前的符号,UNIX一般是-,如ls -ls
    public final static String PREFIX = "-";
    //命令名,如ls,du
    private String commandName = "";
    //参数列表
    private ArrayList<String> paramList = new ArrayList<String>();
    //操作数列表
    private ArrayList<String> dataList = new ArrayList<String>();
    //通过构造函数传递进来命令
    public CommandVO(String commmandStr){
        //常规判断
        if(commmandStr != null && commmandStr.length()!=0){
            //根据分隔符号拆分出执行符号
            String[] complexStr = commmandStr.split(CommandVO.DIVIDE_FLAG);
            //第一个参数是执行符号
            this.commandName = complexStr[ 0 ];
            //把参数放到List中
            for(int i=1;i<complexStr.length;i++){
                String str = complexStr[i];
                //包含前缀符号,认为是参数
                if(str.indexOf(CommandVO.PREFIX)==0){
                    this.paramList.add(str.replace(CommandVO.PREFIX,"").trim());
                }else{
                    this.dataList.add(str.trim());
                }
            }
        }else{
            //传递的命令错误
            System.out.println("命令解析失败,必须传递一个命令才能执行!");
        }
    }
    //得到命令名
    public String getCommandName(){
        return this.commandName;
    }
    //获得参数
    public ArrayList<String> getParam(){
         //为了方便处理空参数
        if(this.paramList.size()==0){
            this.paramList.add("");
        }
        //HashSet具有唯一的有点,可以避免出现两个相同的参数
        return new ArrayList(new HashSet(this.paramList));
    }
    //获得操作数
    public ArrayList<String> getData(){
        return this.dataList;
    }
}
