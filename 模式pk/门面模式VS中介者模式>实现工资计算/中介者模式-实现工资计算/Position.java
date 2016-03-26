public class Position extends AbsColleague implements IPosition{
    //通过构造函数传递中介者
    public Position(AbsMediator _mediator){
        super(_mediator);
    }
    //自有方法self-method
    public void selfMethod(){
        //处理自己的业务逻辑
    }
    //依赖方法dep-method
    public void demote(){
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑,委托给中介者处理
        super.mediator.down(this);
    }
    public void promote(){
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑,委托给中介者处理
        super.mediator.up(this);
    }
}
