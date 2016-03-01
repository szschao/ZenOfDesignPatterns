public class Originator implements Cloneable{
    //男孩的状态
    private String state ="";
    //认识女孩子后状态肯定改变,比如心情,手中的花等
    public String getState(){
        return this.state;
    }
    public void setState(String _state){
        this.state = _state;
    }
    //保留一个备份
    public Originator createMemento(){
         return this.clone();
    }
    //恢复一个备份
    public void restoreMemento(Originator _originator){
         this.setState(_originator.getState());
    }
    //克隆当前对象
    @Override
    protected Originator clone(){
        try{
            return (Originator)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
