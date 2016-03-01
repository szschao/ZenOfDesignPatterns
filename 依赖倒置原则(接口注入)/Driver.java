public class Driver implements IDriver {
    //司机的主要职责是开车
    public void driver(ICar car){
        car.run();
    }
}
