import java.util.List;
import java.util.ArrayList;

class Client {
    public static void main(String args[]) {
        IShowVisitor showVisitor = new ShowVisitor();
        ITotalVisitor totalVisitor = new TotalVisitor();
        for(Employee emp:mockEmployee()){
            emp.accept(showVisitor); //接受展示报表访问者
            emp.accept(totalVisitor); //接受汇总表表访问者
        }
        //展示报表
        showVisitor.report();
        //汇总报表
        totalVisitor.totalSalary();
    }
    //模拟出公司的人员情况,我们可以想象这个数据是通过持久层传递过来的
    public static List<Employee> mockEmployee(){
        List<Employee> empList = new ArrayList<Employee>();
        //产生张三这个员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序,绝对的蓝领,苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);
        //产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工,审美素质太不流行了!");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);
        //产生一个经理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值,但是我会拍马屁呀");
        wangWu.setSalary(18647);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
