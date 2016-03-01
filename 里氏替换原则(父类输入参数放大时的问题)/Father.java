import java.util.Map;
import java.util.Collection;

public class Father{
    public Collection doSomething(Map map){
        System.out.println("父类被执行了...");
        return map.values();
    }
}
