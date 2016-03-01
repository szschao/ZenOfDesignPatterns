import java.util.HashMap;
import java.util.Collection;

public class Father{
    public Collection doSomething(HashMap map){
        System.out.println("父类被执行了...");
        return map.values();
    }
}
