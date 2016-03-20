public interface Algorithm {
    //压缩算法
    public boolean compress(String _source,String _to);
    //解压算法
    public boolean uncompress(String _source,String _to);
}
