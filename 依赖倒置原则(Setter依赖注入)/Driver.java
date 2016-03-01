public class Driver implements IDriver {
    private ICar car;
    //给司机找辆车
    public void setCar(ICar _car){
        this.car=_car;
    }
    //司机的主要职责是开车
    public void driver(){
        this.car.run();
    }
}
