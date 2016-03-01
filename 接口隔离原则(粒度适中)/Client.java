public class Client{
    //搜索并展示美女信息
    public static void main(String args[]) {
        //星探李找到个气质女号
        IGreatTemperamentGirl gtg=new PettyGirl2("妈妈");
        AbstractSearcher2 li = new Searcher2(gtg);
        IGoodBodyGirl gbg=new PettyGirl2("妈妈");
        li = new Searcher2(gbg);
        li.show();
    }
}
