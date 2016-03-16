public class Director{
    //声明对建造者的引用
    private CarBuilder benzBuilder=new BenzBuilder();
    private CarBuilder bmwBuilder=new BenzBuilder();
    //生产奔驰SUV
    public ICar createBenzSuv(){
        //制造出汽车
        return createCar(benzBuilder,"benz的引擎","benz的轮胎");
    }
    //生产出一辆宝马商务车
    public ICar createBMWVan(){
        return createCar(bmwBuilder,"BMW的引擎","BMW的轮胎");
    }
    //生产出一个混合车型
    public ICar createComplexCar(){
        return createCar(bmwBuilder,"BMW的引擎","benz的轮胎");
    }
    private ICar createCar(CarBuilder _carBuilder,String _enging,String _wheel){
        //导演怀揣蓝图
        Blueprint bp = new Blueprint();
        bp.setEnging(_enging);
        bp.setWheel(_wheel);
        System.out.println("获得生产蓝图");
        _carBuilder.receiveBuleprint(bp);
        return _carBuilder.buildCar();
    }
}
