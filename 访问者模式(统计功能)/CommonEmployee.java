public class CommonEmployee extends Employee{
    //工作内容,这非常重要,以后的职业规划就是靠它
    private String job;
    public String getJob(){
        return this.job;
    }
    public void setJob(String _job){
        this.job = _job;
    }
    //我允许访问者访问
    @Override
    public void accept(IVisitor _visitor){
        //把自身传递过去,让访问者访问本身这个对象
        _visitor.visit(this);
    }
}
