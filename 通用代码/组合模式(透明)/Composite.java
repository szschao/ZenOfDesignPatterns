import java.util.ArrayList;

public class Composite extends Component{
    //构件容器
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();
    //增加一个叶子构件或树枝构件
    public void add(Component _component){
        this.componentArrayList.add(_component);
    }
    //删除一个叶子构件或树枝构件
    public void remove(Component _component){
        this.componentArrayList.remove(_component);
    }
    //获得分支下的所有叶子构件和树枝构件
    public ArrayList<Component> getChildren(){
        return this.componentArrayList;
    }
}
