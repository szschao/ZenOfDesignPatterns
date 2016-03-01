import java.util.HashMap;
import java.util.Collection;
public class Son extends Father{
    //放大输入参数类型HashMap->Map
    public Collection doSomething(HashMap map){
        System.out.println("子类被执行了...");
        return map.values();
    }
}
