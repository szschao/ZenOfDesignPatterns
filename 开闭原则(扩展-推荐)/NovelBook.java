public class NovelBook implements IBook {
    //书籍名称
    private String name;
    //书籍价格
    private int price;
    //书籍作者
    private String author;
    //通过构造函数,传递书籍数据
    NovelBook(String _name,int _price,String _author){
        this.name=_name;
        this.price=_price;
        this.author=_author;
    }
    //获得书籍名字
    public String getName(){
        return this.name;
    }
    //获得书籍价格
    public int getPrice(){
        return this.price;
    }
    //获得书籍作者
    public String getAuthor(){
        return this.author;
    }
}
