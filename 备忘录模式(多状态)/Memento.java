import java.util.HashMap;

public class Memento{
    //接受HashMap的状态
    private HashMap<String,Object> stateMap;
    //接受一个对象,建立一个备份
    public Memento(HashMap<String,Object> _map){
        this.stateMap = _map;
    }
    public HashMap<String,Object> getStateMap(){
        return this.stateMap;
    }
    public void setStateMap(HashMap<String,Object> _stateMap){
        this.stateMap = _stateMap;
    }
}
