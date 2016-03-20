public class UglyDuckling extends WhiteSwan implements Duck{
    //丑小鸭的叫声
    public void cry(){
        super.cry();
    }
    //丑小鸭的外形
    public void desAppearance(){
        super.desAppearance();
    }
    //丑小鸭的其他行为
    public void desBehavior(){
        //丑小鸭不仅会游泳,还会飞行
        System.out.println("游泳");
        super.fly();
    }
}
