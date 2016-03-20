public class Zip implements Algorithm{
    //Zip格式的压缩算法
    public boolean compress(String _source,String _to){
        System.out.println(_source+"--->"+_to+"Zip压缩成功");
        return true;
    }
    //Zip格式的解压算法
    public boolean uncompress(String _source,String _to){
        System.out.println(_source+"--->"+_to+"Zip解压成功");
        return true;
    }
}
