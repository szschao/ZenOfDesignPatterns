//不推荐,推荐使用饿汉式单例
public class Singleton{
    private static Singleton singleton = null;
    //限制产生多个对象
    private Singleton(){

    }
    //通过该方法获得实例对象
    public static synchronized Singleton getSingleton(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
    //类中其他方法,尽量是static
    public static void doSomething(){

    }
}

