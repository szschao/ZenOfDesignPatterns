public class PettyGirl2 implements IGoodBodyGirl, IGreatTemperamentGirl {
    private String name;
    //美女的名字
    public PettyGirl2(String _name){
        this.name=_name;
    }
    //脸蛋漂亮
    public void goodLooking(){
        System.out.println(this.name+"---脸蛋很漂亮!");
    }
    //身材要好
    public void niceFigure(){
        System.out.println(this.name+"---身材非常棒");
    }
    //气质要好
    public void greatTemperament(){
        System.out.println(this.name+"---气质非常好!");
    }

}
