public abstract class AbsStar{
    //一个明星参加那些活动
    protected final AbsAction action;
    //约束子类必须实现该构造函数
    public AbsStar(AbsAction _action){
        this.action = _action;
    }
    //每个明星都有自己的主要工作
    public void doJob(){
        this.action.desc();
    }
}
