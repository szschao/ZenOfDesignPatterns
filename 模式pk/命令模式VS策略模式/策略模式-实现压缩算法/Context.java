public class Context{
    //抽象策略
    private Algorithm algorithm = null;
    //构造函数设置具体策略
    public Context(Algorithm _algorithm){
        this.algorithm = _algorithm;
    }
    //执行压缩算法
    public boolean compress(String _source,String _to){
        return this.algorithm.compress(_source,_to);
    }
    //执行解压算法
    public boolean uncompress(String _source,String _to){
        return this.algorithm.uncompress(_source,_to);
    }
}
