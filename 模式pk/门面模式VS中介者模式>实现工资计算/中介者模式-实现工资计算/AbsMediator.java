public abstract class AbsMediator{
    //定义同事类(工资,职位,税收)
    protected final IPosition position;
    protected final ISalary salary;
    protected final ITax tax;
    public AbsMediator(){
        salary = new Salary(this);
        position = new Position(this);
        tax = new Tax(this);
    }
    //中介者模式的业务逻辑
    //工资增加了
    public abstract void up(ISalary _salary);
    //职位提升了
    public abstract void up(IPosition _position);
    //税收增加了
    public abstract void up(ITax _tax);
    //工资降低了
    public abstract void down(ISalary _salary);
    //职位降低了
    public abstract void down(IPosition _position);
    //税收降低了
    public abstract void down(ITax _tax);
}
