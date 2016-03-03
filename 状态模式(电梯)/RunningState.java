public class RunningState extends LiftState {
    //电梯门关闭?这是肯定的
    @Override
    public void close(){
        //do nothing
    }
    //运行的时候打开电梯门?你疯了!电梯不会给你开的
    @Override
    public void open(){
        //do nothing
    }
    //这是要在运行状态下实现的方法
    @Override
    public void run(){
        System.out.println("电梯上下运行");
    }
    //这也是绝对合理的,只运行不停止还有谁敢做这个电梯?!
    public void stop(){
        super.context.setLiftState(Context.stoppingState); //环境设置为停止状态
        super.context.getLiftState().stop();
    }
}
