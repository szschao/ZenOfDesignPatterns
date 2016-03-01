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
    public int getOffPrice(){
        int selfPrice = this.price;
        int offPrice  = 0;
        if(selfPrice>4000){
            //原价>40元,则打9折
            offPrice = selfPrice *90/100;
        }else{
            //其他的则打8折
            offPrice = selfPrice*80/100;
        }
        return offPrice;
    }
    //获得书籍作者
    public String getAuthor(){
        return this.author;
    }
}
