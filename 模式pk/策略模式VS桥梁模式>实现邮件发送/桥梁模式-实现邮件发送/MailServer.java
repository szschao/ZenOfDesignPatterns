public abstract class MailServer{
    //定义对实现化角色的引用
    protected MailTemplate mt;
    //约束子类必须实现该构造函数
    public MailServer(MailTemplate _mt){
        this.mt = _mt;
    }
    //自身的行为和属性
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
    //获得实现化角色
    public MailTemplate getImp(){
        return this.mt;
    }
}
