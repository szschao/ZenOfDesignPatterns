import java.util.Map;
import java.util.HashMap;

public class OuterUserBaseInfo implements IOuterUserBaseInfo{
    //用户的基本信息
    public Map getUserBaseInfo(){
        HashMap baseInfo = new HashMap();
        baseInfo.put("userName","这个员工叫做混世魔王...");
        baseInfo.put("mobileNumber","这个员工电话是...");
        return baseInfo;
    }
}
