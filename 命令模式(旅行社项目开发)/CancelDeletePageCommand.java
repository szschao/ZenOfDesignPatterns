public class CancelDeletePageCommand extends Command{
    //撤销一个页面的命令
    public void execute(){
        super.pg.rollBack();
    }
}
