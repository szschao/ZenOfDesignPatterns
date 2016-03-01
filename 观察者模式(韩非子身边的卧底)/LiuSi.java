public class LiuSi implements Observer{
    //刘斯看到韩非子有活动,自己也得做一些事
    public void update(String str){
        System.out.println("刘斯:观察到韩非子活动,自己也开始了活动...");
        this.happy(str);
        System.out.println("刘斯:笑死了...");
    }
    //汇报给秦始皇
    private void happy(String reportContext){
        System.out.println("刘斯:因为"+reportContext+",---所以我快乐呀!");
    }
}
