public class Decorator implements Swan{
    private Swan swan = null;
    //通过构造函数穿戴被修饰者
    public Decorator(Swan _swan){
        this.swan = _swan;
    }
    //委托给被修饰者执行
    public void fly(){
        this.swan.fly();
    }
    public void cry(){
        this.swan.cry();
    }
    public void desAppearance(){
        this.swan.desAppearance();
    }
}
