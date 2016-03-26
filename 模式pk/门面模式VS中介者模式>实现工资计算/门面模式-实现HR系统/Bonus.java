public class Bonus{
    //考情情况
    private Attendance atte = new Attendance();
    //奖金
    public int getBonus(){
        //获得出勤情况
        int wordDays = atte.getWorkDays();
        //奖金计算模型
        int bonus = wordDays * 1800 / 30;
        return bonus;
    }
}
