public class SortDecorator extends Decorator{
    //构造函数
    public SortDecorator(SchoolReport sr){
        super(sr);
    }
    //我要告诉老爸学校的排名情况
    private void reportSort(){
        System.out.println("我的排名第38名...");
    }
    //老爸看文成绩单后再告诉它,加强作用
    @Override
    public void report(){
        super.report();
        this.reportSort();
    }
}
