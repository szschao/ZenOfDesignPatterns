import java.util.ArrayList;
public class Director{
    private ArrayList<String> sequence = new ArrayList();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();
    /*
     *A类型的奔驰车模型,先start,然后stop,其他什么引擎,喇叭一概没
     */
    public BenzModel getABenzModel(){
        //清理场景
        this.sequence.clear();
        //设置执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        //按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }
    /*
     *B类型的奔驰车,先发动引擎,然后启动,然后停止,没有喇叭
     */
    public BenzModel getBBenzModel(){
        //清理场景
        this.sequence.clear();
        //设置执行顺序
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        //按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }
    /*
     *C型号的宝马车,先按下喇叭,然后启动,然后停止
     */
    public BMWModel getCBMWModel(){
        //清理场景
        this.sequence.clear();
        //设置执行顺序
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        //按照顺序返回一个宝马车
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel)this.bmwBuilder.getCarModel();
    }
}
