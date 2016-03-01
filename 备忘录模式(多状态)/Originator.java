public class Originator{
    //内部状态
    private String state1 ="";
    private String state2 ="";
    private String state3 ="";

    public String getState1(){
        return this.state1;
    }
    public void setState1(String _state){
        this.state1 = _state;
    }
    public String getState2(){
        return this.state2;
    }
    public void setState2(String _state){
        this.state2 = _state;
    }
    public String getState3(){
        return this.state3;
    }
    public void setState3(String _state){
        this.state3 = _state;
    }
    //保留一个备份
    public Memento createMemento(){
         return new Memento(BeanUtils.backupProp(this));
    }
    //恢复一个备份
    public void restoreMemento(Memento _memento){
         BeanUtils.restoreProp(this, _memento.getStateMap());
    }
    //增加一个toString方法
    @Override
    public String toString(){
        return "State1=" + this.state1 +"State2=" + this.state2 + "State3=" + this.state3;
    }
}
