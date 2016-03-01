public class WangSi implements Observer{
    //王斯看到韩非子有活动
    public void update(String str){
        System.out.println("王斯:观察到韩非子活动,自己也开始了活动...");
        this.cry(str);
        System.out.println("王斯:哭死了...");
    }
    //汇报给秦始皇
    private void cry(String reportContext){
        System.out.println("王斯:因为"+reportContext+",---所以我悲伤呀!");
    }
}
