public abstract class AbstractSearcher2 {
	protected IGreatTemperamentGirl greatTemperamentGirl;
	protected IGoodBodyGirl goodBodyGirl;

	public AbstractSearcher2(IGreatTemperamentGirl _greatTemperamentGirl) {
        this.greatTemperamentGirl=_greatTemperamentGirl;
	}

	public AbstractSearcher2(IGoodBodyGirl _goodBodyGirl) {
        this.goodBodyGirl=_goodBodyGirl;
	}

    //搜索美女,列出美女信息
	public abstract void show();

}
