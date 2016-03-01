public class Client {
    public static void main(String[] args){
        //final boolean DEBUG=false;
        final boolean DEBUG=true;
        if(DEBUG){
            //产生三毛这个士兵
            Soldier sanMao=new Soldier();
            //给三毛一支枪
            //sanMao.setGun(new Rifle());
            //sanMao.setGun(new Handgun());
            //sanMao.setGun(new MachineGun());
            sanMao.setGun(new AK47());
            //sanMao.setGun(new AUG()); //没有使用望远镜,不是个合格的狙击手
            sanMao.killEnemy();
        }
        else{
            //产生三毛这个狙击手
            Snipper sanMao=new Snipper();
            //不能向上转型
            //sanMao.setRifle((AUG)new Rifle());
            sanMao.setRifle(new AUG());
            sanMao.killEnemy();
        }
    }
}
