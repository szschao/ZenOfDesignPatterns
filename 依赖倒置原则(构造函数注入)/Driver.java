public class Driver implements IDriver {
    private ICar car;
    //构造函数注入
    public Driver(ICar _car){
        this.car=_car;
    }
    //司机的主要职责是开车
    public void driver(){
        this.car.run();
    }
}
