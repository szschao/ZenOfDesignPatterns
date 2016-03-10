public abstract class Builder{
    //定义一个超人的应用
    protected final SuperMan superMan=new SuperMan();
    //构建出超人的躯体
    public void setBody(String _body){
        this.superMan.setBody(_body);
    }
    //构建出超人的特殊能力
    public void setSpecialTalent(String _st){
        this.superMan.setSpecialTalent(_st);
    }
    //构建出超人的特殊标记
    public void setSpecialSymbol(String _ss){
        this.superMan.setSpecialSymbol(_ss);
    }
    //构建出一个完整的人
    public abstract SuperMan getSuperMan();
}
