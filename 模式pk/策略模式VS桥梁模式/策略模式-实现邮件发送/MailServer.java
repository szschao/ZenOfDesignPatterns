public class MailServer{
    //抽象策略
    private MailTemplate mt = null;
    //构造函数设置具体策略
    public MailServer(MailTemplate _mt){
        this.mt = _mt;
    }
    //发送邮件
    public void sendMail(){
        System.out.println("====正在发送的邮件信息====");
        //发件人
        System.out.println("发件人:"+mt.getFrom());
        //收件人
        System.out.println("收件人:"+mt.getTo());
        //标题
        System.out.println("邮件标题:"+mt.getSubject());
        //邮件内容
        System.out.println("邮件内容:"+mt.getContext());
    }
}
