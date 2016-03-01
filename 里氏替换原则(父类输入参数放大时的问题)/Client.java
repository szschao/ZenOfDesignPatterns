import java.util.Map;
import java.util.HashMap;
public class Client{
    public static void invoke(){
        //final boolean DEBUG=true;
        final boolean DEBUG=false;
        if(DEBUG){
            //父类存在的地方,子类就应该能存在
            Father f=new Father();
            HashMap map=new HashMap();
            f.doSomething(map);
        }
        else{ //父类出现的地方替换成子类
            Son f=new Son();
            HashMap map=new HashMap();
            f.doSomething(map); //子类没有重写父类的前提下,子类会被执行,会引起业务逻辑的混乱
        }
    }
    public static void main(String[] args){
         invoke();
    }
}
