/*
 *公司大老板想看看我们自己公司的年轻女孩子的电话号码
 */
class Client {
    public static void main(String args[]) {
        //没有与外系统链接的时候是这样写
        //IUserInfo youngGirl = new UserInfo();
        //老板一想不对呀,兔子不吃窝边草,还是找借用人员好点
        IUserInfo youngGirl = new OuterUserInfo();
        //从数据库中查到101个
        for(int i=0;i<101;i++){
            youngGirl.getMobileNumber();
        }
    }
}
