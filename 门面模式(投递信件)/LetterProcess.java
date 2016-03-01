public class LetterProcess implements ILetterProcess{
    //写信
    public void writeContext(String context){
        System.out.println("填写信的内容..."+context);
    }
    //在信封上填写必要的信息
    public void fillEnvelope(String address){
        System.out.println("填写收件人地址以及姓名..."+address);
    }
    //把信放到信封中,并封好
    public void letterIntoEnvelope(){
        System.out.println("把信放到信封中...");
    }
    //塞到邮箱中,投递
    public void sendLetter(){
        System.out.println("邮递信件...");
    }
}
