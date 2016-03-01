public class Snipper {

    //狙击手应该使用狙击枪
	private AUG aug;

    //拿到一把狙击枪
	public void setRifle(AUG _aug) {
        this.aug=_aug;
	}

	public void killEnemy() {
        //首先看到敌人的情况,别杀死敌人,自己也被人干掉
        aug.zoomOut();
        //开始射击
        aug.shoot();
	}

}
