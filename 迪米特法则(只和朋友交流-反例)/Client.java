public class Client {
    public static void main(String args[]) {
        //Teacher 类里有不属于他的朋友类
        //如果有变更,将女孩换成男孩的话,会导致Teacher类也变更
        Teacher w=new Teacher();
        w.command(new GroupLeader());
    }
}
