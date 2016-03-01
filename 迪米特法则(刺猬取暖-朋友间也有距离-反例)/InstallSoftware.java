public class InstallSoftware{
    //对朋友类Wizard知道的太多了
    //如果有变更将返回值从int改为boolean的话,不利
    void installWizard(Wizard _wizard){
        int first = _wizard.first();
        if(first > 50){
            int sec = _wizard.second();
            if(sec > 50){
                int thd = _wizard.third();
            }
        }
    }
}
