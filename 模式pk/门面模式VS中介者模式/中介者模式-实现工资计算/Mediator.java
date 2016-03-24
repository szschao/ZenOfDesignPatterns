public class Mediator extends AbsMediator{
    @Override
    public void up(ISalary _salary){
        //调用同事类的方法,只要是public方法都可以调用
        upSalary();
        upTax();
    }
    public void up(IPosition _position){
        upPosition();
        upSalary();
        upTax();
    }
    public void up(ITax _tax){
        upTax();
        downSalary();
    }
    public void down(ISalary _salary){
        downSalary();
        downTax();
    }
    public void down(IPosition _position){
        downPosition();
        downSalary();
        downTax();
    }
    public void down(ITax _tax){
        downTax();
        upSalary();
    }
    //工资,职位,税收降低的处理方法相同
    //工资增加
    private void upSalary(){
        System.out.println("工资翻倍,乐翻天");
    }
    private void upTax(){
        System.out.println("税收上升,为国家做贡献");
    }
    private void upPosition(){
        System.out.println("职位上升一级,狂喜");
    }
    private void downSalary(){
        System.out.println("经济不景气,降低工资");
    }
    private void downTax(){
        System.out.println("税收减少,国家收入减少");
    }
    private void downPosition(){
        System.out.println("官降三级,比自杀还痛苦");
    }
}
