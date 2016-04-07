public abstract class CommandName{
    private CommandName nextHandler;
    //每个处理者都必须对请求作出处理
    public final String handleMessage(CommandVO _vo){
        //处理结果
        String response = "";
        //判断是否是自己的处理级别
        if(_vo.getParam().size()==0||_vo.getParam().contains(this.getHandlerLevel())){
            response = this.echo(_vo);
        }else{
            //不属于自己的处理级别
            //判断是否有下一个处理
            if(this.nextHandler != null){
                response = this.nextHandler.handleMessage(_vo);
            }else{
                //没有适当的处理,业务自行处理
                response = "命令无法执行";
            }
        }
        return response;
    }
    //设置下一个处理者是谁
    public void setNext(CommandName _handler){
        this.nextHandler = _handler;
    }
    //每个处理者都有一个处理级别
    protected abstract String getHandlerLevel();
    //每个处理者都必粗实现处理任务
    protected abstract String echo(CommandVO vo);
}
