public interface IReceiver{
    //压缩
    public abstract boolean compress(String _source,String _to);
    //解压
    public abstract boolean uncompress(String _source,String _to);
}
