public class Caretaker{
    //备忘录对象
    private IMemento memento;
    public IMemento getMemento(){
        return this.memento;
    }
    public void setMemento(IMemento _memento){
        this.memento = _memento;
    }
}
