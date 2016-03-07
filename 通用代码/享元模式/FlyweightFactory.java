import java.util.HashMap;

public class FlyweightFactory{
    //定义一个池容器
    private static HashMap<String,Flyweight> pool = new HashMap<String,Flyweight>();
    //享元工厂
    public static Flyweight getFlyweight(String _extinsic) {
        //需要返回的对象
        Flyweight flyweight = null;
        //在池中没有该对象
        if(pool.containsKey(_extinsic)){
            flyweight = pool.get(_extinsic);
        }else{
            //根据外部状态创建享元对象
            flyweight = new ConcreteFlyweight(_extinsic);
            //放置到池中
            pool.put(_extinsic,flyweight);
        }
        return flyweight;
    }
}
