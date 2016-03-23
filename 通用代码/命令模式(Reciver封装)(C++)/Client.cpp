#include "Invoker.h"
#include "Command.h"
#include "ConcreteCommand1.h"
#include "ConcreteCommand2.h"
#include "Receiver.h"
#include "ConcreteReceiver1.h"
#include "ConcreteReceiver2.h"

int main()
{
    cout << "-------------------------" << endl;
    //首先声明调用者Invoker
    Invoker* pInvoker = new Invoker();
    cout << "-------------------------" << endl;
    //定义一个发送给接收者的命令
    Command* pCmd = new ConcreteCommand1();
    cout << "-------------------------" << endl;
    //把命令交给调用者去执行
    pInvoker->SetCommand(pCmd);
    pInvoker->Action();
    cout << "-------------------------" << endl;
    delete pInvoker;
    cout << "-------------------------" << endl;
    delete pCmd;

    return 0;
}
