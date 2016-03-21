public class Postfix extends MailServer{
    //覆写构造函数
    public Postfix(MailTemplate _mt){
        super(_mt);
    }
    //修正邮件发送程序
    @Override
    public void sendMail(){
        //增加邮件服务器信息
        super.getImp().add("Recived: from xxx (unkown [xxx.xxx.xxx.xxx])by aaa.aaa.com (Postfix) with ESMTP id 8DBCD172B8\n");
        super.sendMail();
    }
}
