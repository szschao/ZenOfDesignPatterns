public class FilmStar extends AbsStar{
    //默认的电影明星的主要工作就拍电影
    public FilmStar(){
        super(new ActFilm());
    }
    //也可以重新设置一个新职业
    public FilmStar(AbsAction _action){
        super(_action);
    }
    //细化电影明星的职责
    @Override
    public void doJob(){
        //业务处理...
        System.out.println("\n===电影的工作===");
        super.doJob();
    }
}
