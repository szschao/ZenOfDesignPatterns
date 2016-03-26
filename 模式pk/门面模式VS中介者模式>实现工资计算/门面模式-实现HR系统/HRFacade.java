import java.util.Date;

//模块一可以完整的访问所有业务逻辑
public class HRFacade{
    //总工资情况
    private SalaryProvider salaryProvider = new SalaryProvider();
    //考情情况
    private Attendance attendance = new Attendance();

    //查询一个人的总收入
    public int querySalary(String _name,Date _date){
        return this.salaryProvider.totalSalary();
    }
    //查询一个员工一个月工作了多少天
    public int queryWorkDays(String _name){
        return this.attendance.getWorkDays();
    }
}
