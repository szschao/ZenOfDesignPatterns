//门面不参与子系统内的业务逻辑
public class Context{
    //委托处理
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    //复杂的计算
    public void complexMethod(){
        this.a.doSomethingA();
        this.b.doSomethingB();
    }
}
