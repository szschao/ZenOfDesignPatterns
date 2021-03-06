import java.util.ArrayList; import java.text.NumberFormat;
//增加打折处理,修改接口(接口应稳定,契约作用)
//40以上9折,其他8折
public class BookStore{
    private final static ArrayList<IBook> bookList = new ArrayList<IBook>();
    //Static 静态模块初始化数据,实际项目中一般是由持久层完成
    static{
        bookList.add(new NovelBook("天龙八部",3200,"金庸"));
        bookList.add(new NovelBook("巴黎圣母院",5600,"雨果"));
        bookList.add(new NovelBook("悲惨世界",3500,"雨果"));
        bookList.add(new NovelBook("金瓶梅",3500,"雨果"));
    }
    //模拟书店买书
    public static void main(String args[]) {
        NumberFormat formatter=NumberFormat.getCurrencyInstance();
        formatter.setMaximumFractionDigits(2);
        System.out.println("-------书店卖出去的书籍记录如下:----------");
        for(IBook book:bookList){
            System.out.println("书籍名称:"+book.getName()+"\t书籍作者:"+book.getAuthor()+"\t书籍价格:"+book.getOffPrice()/100.0+"元");
        }
    }
}
