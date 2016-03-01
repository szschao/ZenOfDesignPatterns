public class ConcreteElement1 extends Element{
    //完善业务逻辑
    public void doSomething(){
        //业务逻辑
    }
    //允许哪个访问者访问
    public void accept(IVisitor _visitor){
        _visitor.visit(this);
    }
}
