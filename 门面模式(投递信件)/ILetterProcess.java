public interface ILetterProcess{
    //首先要写信得内容
    public void writeContext(String context);
    //其次写封信
    public void fillEnvelope(String address);
    //把信放到信封里
    public void letterIntoEnvelope();
    //然后邮递
    public void sendLetter();
}
