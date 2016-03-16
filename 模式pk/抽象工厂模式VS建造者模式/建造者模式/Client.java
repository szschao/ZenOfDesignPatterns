public class Client {
    public static void main(String args[]) {
        //定义出导演类
        Director director=new Director();
        //给我一辆奔驰SUV
        System.out.println("===制造一辆奔驰SUV===");
        ICar benzSuv=director.createBenzSuv();
        System.out.println(benzSuv);
        //给我一辆宝马商务车
        System.out.println("===制造一辆宝马商务车===");
        ICar bmwVan=director.createBMWVan();
        System.out.println(bmwVan);
        //给我一辆混合车型
        System.out.println("===制造一辆混合车型===");
        ICar complexCar=director.createComplexCar();
        System.out.println(complexCar);
    }
}
