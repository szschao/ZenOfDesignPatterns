public class MultiThread extends Thread{
    private SignInfo signInfo;
    public MultiThread(SignInfo _signInfo){
        this.signInfo = _signInfo;
    }
    public void run(){
        //判断特殊值，检查线程是否安全
        if(!signInfo.getID().equals(signInfo.getLocation())){
            System.out.println("编号:"+signInfo.getID());
            System.out.println("考试地址:"+signInfo.getLocation());
            System.out.println("线程不安全了");
        }
    }
}
