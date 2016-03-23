#include "ConcreteReceiver1.h"
ConcreteReceiver1::ConcreteReceiver1()
{
    cout << "ConcreteReceiver1..." << endl;
}

ConcreteReceiver1::~ConcreteReceiver1()
{
    cout << "~ConcreteReceiver1..." << endl;
}

void ConcreteReceiver1::doSomething()
{
    //每个接收者都必须处理一定的业务逻辑
    cout << "ConcreteReceiver1::doSomething" << endl;
}

