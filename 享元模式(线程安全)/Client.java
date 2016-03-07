public class Client {
    public static void main(String args[]) {
        //初始化对象池
        for (int i=0; i<4; i++) {
            String subject = "科目" + i;
            SignInfoFactory.getSignInfo(subject);
            //取得对象
            SignInfo signInfo = SignInfoFactory.getSignInfo("科目2");
            while(true){
                signInfo.setID("ZhangSan");
                signInfo.setLocation("ZhangSan");
                (new MultiThread(signInfo)).start();
                signInfo.setID("LiSi");
                signInfo.setLocation("LiSi");
                (new MultiThread(signInfo)).start();
            }
        }
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
    }
}
