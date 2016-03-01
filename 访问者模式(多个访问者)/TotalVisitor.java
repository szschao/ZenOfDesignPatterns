public class TotalVisitor implements ITotalVisitor{
    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;
    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    //普通员工的工资总和
    private int commonTotalSalary = 0;
    //部门经理的工资总和
    private int managerTotalSalary = 0;

    //访问普通员工,计算工资总额
    public void visit(CommonEmployee _commonEmployee){
        calCommonSalary(_commonEmployee.getSalary());
    }
    //访问部门经理,计算工资总额
    public void visit(Manager _manager){
        calManagerSalary(_manager.getSalary());
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
    public void totalSalary(){
        System.out.println("本公司的月工资总额:"+(this.commonTotalSalary + this.managerTotalSalary));
    }
}
