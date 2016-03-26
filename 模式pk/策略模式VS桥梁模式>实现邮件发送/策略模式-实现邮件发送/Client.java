//要使用哪个策略,先产生出它的对象,然后放到封装角色中
class Client {
    public static void main(String args[]) {
        //创建一封HTML格式的邮件
        MailTemplate mt = new HtmlMail("a@a.com","b@b.com","外星人攻击地球了","结局是外星人被地球人打败了");
        //创建一个Mail发送程序
        MailServer context = new MailServer(mt);
        //执行封装后的方法
        context.sendMail();
    }
}
