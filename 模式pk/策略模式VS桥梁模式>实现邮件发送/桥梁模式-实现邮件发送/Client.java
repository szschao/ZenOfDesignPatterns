public class Client {
    public static void main(String args[]) {
        //创建一封Html格式的邮件
        MailTemplate mt = new HtmlMail("a@a.com","b@b.com","外星人攻击地球了","结局是外星人被地球人打败了");
        //定义一个抽象化角色
        MailServer mail = new Postfix(mt);
        //执行文
        mail.sendMail();
    }
}
