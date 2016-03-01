import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]) {
        //产生一个全班女生群体
        List<Girl> listGirls=new ArrayList<Girl>();
        for(int i=0;i<20;i++){
            listGirls.add(new Girl());
        }
        Teacher w=new Teacher();
        w.command(new GroupLeader(listGirls));
    }
}
