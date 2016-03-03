public class OpenningState extends LiftState {
    //开启当然可以关闭,我就想测试一下电梯门开关功能
    @Override
    public void close(){
        //状态修改
        super.context.setLiftState(Context.closingState);
        //动作委托为ClosingState来执行
        super.context.getLiftState().close();
    }
    //打开电梯门
    @Override
    public void open(){
        System.out.println("电梯门开启...");
    }
    //门开着时电梯就运行跑,这电梯,吓死你!
    @Override
    public void run(){
        //do nothing
    }
    //开门还不停止?
    @Override
    public void stop(){
        //do nothing
    }
}
