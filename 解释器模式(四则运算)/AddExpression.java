import java.util.HashMap;

public class AddExpression extends SymbolExpression{
    public AddExpression(Expression _left,Expression _right){
        super(_left,_right);
    }
    //左右两个表达式相加
    public int interpreter(HashMap<String,Integer> _var){
        return super.left.interpreter(_var) + super.right.interpreter(_var);
    }
}
