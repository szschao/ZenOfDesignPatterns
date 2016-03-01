public class Originator implements Cloneable{
    private Originator backup;
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
    public void createMemento(){
         this.backup = this.clone();
    }
    //恢复一个备份
    public void restoreMemento(){
        //在进行恢复前应该进行断言,防止空指针
         this.setState(this.backup.getState());
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
