public abstract class Employee{
    public final static int MALE = 0; //0代表是男性
    public final static int FEMALE = 1; //1代表是女性
    //甭管是谁,都有名字
    private String name;
    //只要是员工,那就有薪水
    private int salary;
    //性别很重要
    private int sex;

    //以下是简单的getter/setter
    public String getName(){
        return this.name;
    }
    public void setName(String _name){
        this.name = _name;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int _salary){
        this.salary = _salary;
    }
    public int getSex(){
        return this.sex;
    }
    public void setSex(int _sex){
        this.sex = _sex;
    }
    //我允许一个访问者访问
    public abstract void accept(IVisitor _visitor);
}
