public class Husband extends Handler{
    //丈夫只处理女儿的请求
    public Husband(){
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }
    //丈夫的答复
    protected void response(IWomen _women){
        System.out.println("---妻子向丈夫请示---");
        System.out.println(_women.getRequest());
        System.out.println("丈夫的答复是:同意");
    }
}
