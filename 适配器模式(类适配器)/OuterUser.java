import java.util.Map;
import java.util.HashMap;

public class OuterUser implements IOuterUser{
    //用户的基本信息
    public Map getUserBaseInfo(){
        HashMap baseInfo = new HashMap();
        baseInfo.put("userName","这个员工叫做混世魔王...");
        baseInfo.put("mobileNumber","这个员工电话是...");
        return baseInfo;
    }
    //员工的家庭信息
    public Map getUserHomeInfo(){
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber","员工的家庭电话是...");
        homeInfo.put("homeAddress","员工的家庭地址是...");
        return homeInfo;
    }
    //员工的工作信息,比如,职位等
    public Map getUserOfficeInfo(){
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition","这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber","员工的办公电话是...");
        return officeInfo;
    }
}
