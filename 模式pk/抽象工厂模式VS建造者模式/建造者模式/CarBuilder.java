public abstract class CarBuilder{
    //待构件的汽车
    private ICar car;
    //设计蓝图
    private Blueprint bp;

    public  Car buildCar(){
        //按照顺序生产一辆车
        return new Car(buildEnging(),buildWheel());
    }
    //接收一份蓝图
    public void receiveBuleprint(Blueprint _bp){
        this.bp=_bp;
    }
    protected Blueprint getBlueprint(){
        return bp;
    }
    //建造车轮
    protected abstract String buildWheel();
    //建造引擎
    protected abstract String buildEnging();
}
