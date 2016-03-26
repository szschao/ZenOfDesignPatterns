import java.util.Random;

public class RunnerAgent implements IRunner{
    private IRunner runner = null;
    public RunnerAgent(IRunner _runner){
        this.runner = _runner;
    }
    //代理人是不会跑的
    public void run(){
         this.before();
         Random rand=new Random();
         if(rand.nextBoolean()){
             System.out.println("代理人同意安排运动员跑步");
             this.runner.run();
         }else{
             System.out.println("代理人心情不好,不安排运动员跑步");
         }
         this.after();
    }
    //预处理
    private void before(){
         //do something
    }
    //善后处理
    private void after(){
         //do something
    }
}
