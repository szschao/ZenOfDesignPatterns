public class SendMail extends MailServer{
    //覆写构造函数
    public SendMail(MailTemplate _imp){
        super(_imp);
    }
    //修正邮件发送程序
    @Override
    public void sendMail(){
        //增加邮件服务器信息
        super.getImp().add("Recived: (sendMail); 7 Nov 2016 04:14:44 +0100");
        super.sendMail();
    }R
}
