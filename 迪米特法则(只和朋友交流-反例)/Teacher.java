import java.util.ArrayList;
import java.util.List;
public class Teacher{
    public void command(GroupLeader groupLeader){
        List<Girl> girlList=new ArrayList();
        for(int i=0;i<20;i++){
            girlList.add(new Girl());
        }
        groupLeader.countGirls(girlList);
    }
}
