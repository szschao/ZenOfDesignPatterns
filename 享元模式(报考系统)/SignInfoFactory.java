import java.util.HashMap;

public class SignInfoFactory{
    //池容器
    private static HashMap<String,SignInfo> pool = new HashMap<String,SignInfo>();
    //报名信息的对象工厂
    @Deprecated
    public static SignInfo getSignInfo(){
        return new SignInfo();
    }
    //从池中获得对象
    public static SignInfo getSignInfo(String _key){
        //设置返回对象
        SignInfo result = null;
        //池中没有该对象,则建立,放入池中
        if(!pool.containsKey(_key)){
            System.out.println(_key + "----建立对象,并放置到池中");
            result = new SignInfo4Pool(_key);
            pool.put(_key,result);
        }else{
            result = pool.get(_key);
            System.out.println(_key + "---直接从池中取得");
        }
        return result;
    }
}
