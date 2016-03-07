import java.util.HashMap;

public class SignInfoFactory{
    //池容器
    private static HashMap<ExtrinsicState,SignInfo> pool = new HashMap<ExtrinsicState,SignInfo>();
    //从池中获得对象
    public static SignInfo getSignInfo(ExtrinsicState _key){
        //设置返回对象
        SignInfo result = null;
        //池中没有该对象,则建立,放入池中
        if(!pool.containsKey(_key)){
            //System.out.println(_key + "----建立对象,并放置到池中");
            result = new SignInfo();
            pool.put(_key,result);
        }else{
            result = pool.get(_key);
            //System.out.println(_key + "---直接从池中取得");
        }
        return result;
    }
}
