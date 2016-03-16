public class BMWFactory extends CarFactory{
    //生产SUV
    public ICar createSuv(){
        return new BMWSuv();
    }
    //生产商务车
    public ICar createVan(){
        return new BMWVan();
    }
}
