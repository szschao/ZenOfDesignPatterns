public class Soldier {
    //士兵应该拥有一支枪
	private AbstractGun gun;

    //发给士兵一支枪
	public void setGun(AbstractGun _gun) {
        this.gun=_gun;
	}

	public void killEnemy() {
        System.out.println("士兵开始杀敌人...");
        gun.shoot();
	}

}
