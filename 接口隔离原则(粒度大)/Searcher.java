public class Searcher extends AbstractSearcher {

    public Searcher(IPettyGirl _pettyGirl){
        super(_pettyGirl);
    }
    //展示美女信息
    public void show(){
        System.out.println("-----美女的信息如下:------");
        super.pettyGirl.goodLooking();
        super.pettyGirl.niceFigure();
        super.pettyGirl.greatTemperament();
    }
}
