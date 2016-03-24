public class Tax extends AbsColleague implements ITax{
    //通过构造函数传递中介者
    public Tax(AbsMediator _mediator){
        super(_mediator);
    }
    //自有方法self-method
    public void selfMethod(){
        //处理自己的业务逻辑
    }
    //依赖方法dep-method
    public void drop(){
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑,委托给中介者处理
        super.mediator.down(this);
    }
    public void raise(){
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑,委托给中介者处理
        super.mediator.up(this);
    }
}
