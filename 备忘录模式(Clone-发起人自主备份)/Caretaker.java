public class Caretaker{
    //备忘录对象
    private Originator originator;
    public Originator getOriginator(){
        return this.originator;
    }
    public void setOriginator(Originator _originator){
        this.originator = _originator;
    }
}
