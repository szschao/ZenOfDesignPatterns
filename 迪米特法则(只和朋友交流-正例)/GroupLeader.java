import java.util.ArrayList;
import java.util.List;

public class GroupLeader{
    private List<Girl> girlList;
    //组长拿到了队里女孩的名单
    GroupLeader(List<Girl> _girlList){
        this.girlList=_girlList;
    }
    public void countGirls(){
        System.out.println("女生的数量是:"+girlList.size());
    }

}
