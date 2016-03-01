public class Visitor implements IVisitor{
    //访问普通员工,打印出报表
    public void visit(CommonEmployee _commonEmployee){
        System.out.println(this.getCommonEmployee(_commonEmployee));
    }
    //访问部门经理,打印出报表
    public void visit(Manager _manager){
        System.out.println(this.getManagerInfo(_manager));
    }
    //组装出基本信息
    private String getBasicInfo(Employee _employee){
        String info = "姓名: "+_employee.getName() + "\t";
        info = info +"性别: "+(_employee.getSex() == Employee.FEMALE?"女":"男") + "\t";
        info = info +"薪水: "+_employee.getSalary()+"\t";
        return info;
    }
    //组装出部门经理的信息
    private String getManagerInfo(Manager _manager){
        String basicInfo = this.getBasicInfo(_manager);
        String otherInfo = "业绩: " +_manager.getPerformance()+"\t";
        return basicInfo + otherInfo;
    }
    //组装出普通员工信息
    private String getCommonEmployee(CommonEmployee _commonEmployee){
        String basicInfo = this.getBasicInfo(_commonEmployee);
        String otherInfo = "工作: "+_commonEmployee.getJob()+"\t";
        return basicInfo + otherInfo;
    }
}
