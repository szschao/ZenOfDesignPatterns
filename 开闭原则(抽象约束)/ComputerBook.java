public class ComputerBook implements IComputerBook{
    private String name;
    private String scope;
    private String author;
    private int price;
    public ComputerBook(String _name,int _price,String _author,String _scope){
        this.name   = _name;
        this.scope  = _scope;
        this.author = _author;
        this.price  = _price;
    }
    public String getScope(){
        return this.scope;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPrice(){
        return this.price;
    }
}
