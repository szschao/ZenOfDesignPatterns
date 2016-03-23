#include "ConcreteReceiver2.h"
ConcreteReceiver2::ConcreteReceiver2()
{
    cout << "ConcreteReceiver2..." << endl;
}

ConcreteReceiver2::~ConcreteReceiver2()
{
    cout << "~ConcreteReceiver2..." << endl;
}

void ConcreteReceiver2::doSomething()
{
    //每个接收者都必须处理一定的业务逻辑
    cout << "ConcreteReceiver2::doSomething" << endl;
}

