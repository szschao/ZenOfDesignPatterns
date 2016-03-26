public class BenzBuilder extends CarBuilder{
    public String buildEnging(){
        return super.getBlueprint().getEnging();
    }
    public String buildWheel(){
        return super.getBlueprint().getWheel();
    }
}
