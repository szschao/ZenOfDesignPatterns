public class Gzip implements Algorithm{
    //Gzip格式的压缩算法
    public boolean compress(String _source,String _to){
        System.out.println(_source+"--->"+_to+"Gzip压缩成功");
        return true;
    }
    //Gzip格式的解压算法
    public boolean uncompress(String _source,String _to){
        System.out.println(_source+"--->"+_to+"Gzip解压成功");
        return true;
    }
}
