public class Singleton{
    //不允许通过new产生一个对象
    private Singleton(){

    }
    public void doSomething(){
        System.out.println("业务处理");
    }
}
