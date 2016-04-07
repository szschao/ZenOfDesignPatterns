public class DF extends AbstractDF{
    //最简单的df命令
    protected String echo(CommandVO _request){
        //完成处理逻辑
        return DiskManager.df("");
    }
    //设置自己的处理级别
    protected String getHandlerLevel(){
        //设置自己的处理级别
        return super.DEFAULT_PARAM;
    }
}
