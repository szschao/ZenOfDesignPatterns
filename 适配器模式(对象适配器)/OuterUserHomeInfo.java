import java.util.Map;
import java.util.HashMap;

public class OuterUserHomeInfo implements IOuterUserHomeInfo{
    //员工的家庭信息
    public Map getUserHomeInfo(){
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber","员工的家庭电话是...");
        homeInfo.put("homeAddress","员工的家庭地址是...");
        return homeInfo;
    }
}
