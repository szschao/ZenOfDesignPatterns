public class LS_L extends AbstractLS{
    //定义自己的处理逻辑
    protected String echo(CommandVO _request){
        //完成处理逻辑 TODO
        return FileManager.ls_l("");
    }
    //设置自己的处理级别
    protected String getHandlerLevel(){
        //设置自己的处理级别
        return super.A_PARAM;
    }
}
