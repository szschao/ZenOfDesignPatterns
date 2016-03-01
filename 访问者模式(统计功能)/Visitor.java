public class Visitor implements IVisitor{
    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;
    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    //普通员工的工资总和
    private int commonTotalSalary = 0;
    //部门经理的工资总和
    private int managerTotalSalary = 0;

    //访问普通员工,打印出报表
    public void visit(CommonEmployee _commonEmployee){
        System.out.println(this.getCommonEmployee(_commonEmployee));
        calCommonSalary(_commonEmployee.getSalary());
    }
    //访问部门经理,打印出报表
    public void visit(Manager _manager){
        System.out.println(this.getManagerInfo(_manager));
        calManagerSalary(_manager.getSalary());
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

    //计算部门经理的工资总和
    private void calManagerSalary(int _salary){
         this.managerTotalSalary = this.managerTotalSalary + _salary * MANAGER_COEFFICIENT;
    }
    //计算普通员工的工资总和
    private void calCommonSalary(int _salary){
         this.commonTotalSalary = this.commonTotalSalary + _salary * COMMONEMPLOYEE_COEFFICIENT;
    }
    //获得所有员工的工资总和
    public int getTotalSalary(){
        return this.commonTotalSalary + this.managerTotalSalary;
    }
}
