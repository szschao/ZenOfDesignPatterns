public class ModenPostOffice{
    private ILetterProcess letterProcess = new LetterProcess();
    private Police letterPolice = new Police();
    //写信 ,封装,投递一体化
    public void sendLetter(String context,String address){
        //开始写信
        letterProcess.writeContext(context);
        //开始写信封
        letterProcess.fillEnvelope(address);
        //警察要检查信件了
        letterPolice.checkLetter(letterProcess);
        //把信放到信封里,并封装好
        letterProcess.letterIntoEnvelope();
        //跑到邮局把信塞到邮箱,投递
        letterProcess.sendLetter();
    }
}
