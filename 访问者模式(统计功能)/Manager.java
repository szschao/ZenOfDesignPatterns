public class Manager extends Employee{
    //这类人物的职责非常明确:业绩
    private String performance;
    public String getPerformance(){
        return this.performance;
    }
    public void setPerformance(String _performance){
        this.performance = _performance;
    }
    //部门经理允许访问者访问
    @Override
    public void accept(IVisitor _visitor){
        _visitor.visit(this);
    }
}
