public class DF_K extends AbstractDF{
    //命令处理
    protected String echo(CommandVO _request){
        //完成处理逻辑
        return DiskManager.df_k("");
    }
    //设置自己的处理级别
    protected String getHandlerLevel(){
        //设置自己的处理级别
        return super.K_PARAM;
    }
}
