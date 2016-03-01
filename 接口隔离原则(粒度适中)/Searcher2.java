public class Searcher2 extends AbstractSearcher2 {

    public Searcher2(IGreatTemperamentGirl _gtg){
        super(_gtg);
    }
    public Searcher2(IGoodBodyGirl _gbg){
        super(_gbg);
    }
    //展示美女信息
    public void show(){
        System.out.println("-----美女的信息如下:------");
        super.goodBodyGirl.goodLooking();
        super.goodBodyGirl.niceFigure();
        super.greatTemperamentGirl.greatTemperament();
    }
}
