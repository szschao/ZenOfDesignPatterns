public class RunnerWithJet extends Decorator{
    //定义被修饰者
    public RunnerWithJet(IRunner _runner){
        super(_runner);
    }
    //定义自己的修饰方法
    private void addJet(){
        System.out.println("加快运动员的速度:为运动员增加喷气装置");
    }
    //重写父类的operate方法
    public void run(){
        this.addJet();
        super.run();
    }
}
