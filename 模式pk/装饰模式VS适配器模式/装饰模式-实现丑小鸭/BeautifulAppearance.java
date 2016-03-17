public class BeautifulAppearance extends Decorator{
    //定义被修饰者
    public BeautifulAppearance(Swan _swan){
        super(_swan);
    }
    //定义自己的修饰方法
    private void goodLooking(){
        System.out.println("外表是纯白色的,非常惹人喜爱!");
    }
    //重写父类的operate方法
    public void desAppearance(){
        this.goodLooking();
        //super.operate();
    }
}
