public class Father extends Handler{
    //父亲只处理女儿的请求
    public Father(){
        super(Handler.FATHER_LEVEL_REQUEST);
    }
    //父亲的答复
    protected void response(IWomen _women){
        System.out.println("---女儿向父亲请示---");
        System.out.println(_women.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}
