import java.util.HashMap;

public class VarExpression extends Expression{
    private String key;
    public VarExpression(String _key){
        this.key = _key;
    }
    //从Map中取值
    public int interpreter(HashMap<String,Integer> _var){
        return _var.get(this.key);
    }
}
