public abstract class MailTemplate {
    //邮件发件人
    private String from;
    //收件人
    private String to;
    //邮件标题
    private String subject;
    //邮件内容
    private String context;
    //通过构造函数传递邮件信息
    public MailTemplate(String _from,String _to,String _subject,String _context){
        this.from = _from;
        this.to = _to;
        this.subject = _subject;
        this.context = _context;
    }
    public String getFrom(){
        return this.from;
    }
    public void setFrom(String _from){
        this.from = _from;
    }
    public String getTo(){
        return this.to;
    }
    public void setTo(String _to){
        this.to = _to;
    }
    public String getSubject(){
        return this.subject;
    }
    public void setSubject(String _subject){
        this.subject = _subject;
    }
    public String getContext(){
        return this.context;
    }
    public void setContext(String _context){
        this.context = _context;
    }
}
