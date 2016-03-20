//不成文的约束:
//把状体对象声明为静态常量,有几个状态对象就声明几个静态常量
//环境角色具有状态抽象角色定义的所有行为,具体执行使用委托方式
public class Human{
    //定义都具备哪些状态
    public final static HumanState CHILD_STATE = new ChildState();
    public final static HumanState ADULT_STATE = new AdultState();
    public final static HumanState OLD_STATE = new OldState();
    //定义一个人的状态
    private HumanState state;
    //获得当前状态
    public HumanState getHumanState(){
        return state;
    }
    //设置当前状态
    public void setHumanState(HumanState _state){
        this.state = _state;
        //切换状态
        this.state.setHuman(this);
    }
    //人类的工作
    public void work(){
        this.state.work();
    }
}
