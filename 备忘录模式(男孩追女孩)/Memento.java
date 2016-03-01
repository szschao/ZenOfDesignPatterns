public class Memento{
    //男孩的状态
    private String state = "";
    //通过构造函数传递状态
    public Memento(String _state){
        this.state = _state;
    }
    public String getState(){
        return this.state;
    }
    public void setState(String _state){
        this.state = _state;
    }
}
