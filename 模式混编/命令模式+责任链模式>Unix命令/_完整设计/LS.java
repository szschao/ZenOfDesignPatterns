public class LS extends AbstractLS{
    //最简单的ls命令
    protected String echo(CommandVO _request){
        System.out.println("处理LS");
        //完成处理逻辑
        return FileManager.ls("");
    }
    //设置自己的处理级别
    protected String getHandlerLevel(){
        //设置自己的处理级别
        return super.DEFAULT_PARAM;
    }
}
