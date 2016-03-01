import java.util.HashMap;

public class Caretaker{
    //备忘录对象
    private HashMap<String,Memento> memMap = new HashMap<String,Memento>();
    public Memento getMemento(String _idx){
        return this.memMap.get(_idx);
    }
    public void setMemento(String _idx,Memento _memento){
        this.memMap.put(_idx, _memento);
    }
}
