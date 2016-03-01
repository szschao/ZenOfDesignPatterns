public class ShowVisitor implements IShowVisitor{
    private String info = "";
    //打印出报表
    public void report(){
        System.out.println(this.info);
    }
    //访问普通员工,打印出报表
    public void visit(CommonEmployee _commonEmployee){
        this.getCommonEmployee(_commonEmployee);
    }
    //访问部门经理,打印出报表
    public void visit(Manager _manager){
        this.getManagerInfo(_manager);
    }
    //组装出基本信息
    private String getBasicInfo(Employee _employee){
        this.info = "姓名: "+_employee.getName() + "\t";
        this.info += "性别: "+(_employee.getSex() == Employee.FEMALE?"女":"男") + "\t";
        this.info += "薪水: "+_employee.getSalary()+"\t";
        return info;
    }
    //组装出部门经理的信息
    private String getManagerInfo(Manager _manager){
        this.info += this.getBasicInfo(_manager);
        this.info += "业绩: " +_manager.getPerformance()+"\t\n";
        return this.info;
    }
    //组装出普通员工信息
    private String getCommonEmployee(CommonEmployee _commonEmployee){
        this.info += this.getBasicInfo(_commonEmployee);
        this.info += "工作: "+_commonEmployee.getJob()+"\t\n";
        return this.info;
    }
}
