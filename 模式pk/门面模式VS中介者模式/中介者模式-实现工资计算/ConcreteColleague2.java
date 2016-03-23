public class ConcreteColleague2 extends Colleague{
    //通过构造函数传递中介者
    public ConcreteColleague2(Mediator _mediator){
        super(_mediator);
    }
    //自有方法self-method
    public void selfMethod(){
        //处理自己的业务逻辑
    }
    //依赖方法dep-method
    public void depMethod(){
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑,委托给中介者处理
        super.mediator.doSomething2();
    }
}
