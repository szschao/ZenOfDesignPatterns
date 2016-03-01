public class FouthGradeSchoolReport extends SchoolReport{
    //我的成绩单
    public void report(){
        //成绩单的格式是这个样子的
        System.out.println("尊敬的xxx家长:");
        System.out.println("  ......");
        System.out.println("语文 62 数学 65 体育 93 自然 63");
        System.out.println("  ......");
        System.out.println("            家长签名");
    }
    //家长签名
    public void sign(String _name){
        System.out.println("家长签名: "+_name);
    }
}
