#include "ConcreteCommand2.h"
ConcreteCommand2::ConcreteCommand2(void)
{
    //声明自己的默认接收者
    this->Command::_pReciever = new ConcreteReceiver2();
    cout << "ConcreteCommand1..." << endl;
}

ConcreteCommand2::ConcreteCommand2(Receiver* pReceiver)
{
    this->_recv = pReceiver;
    cout << "ConcreteCommand2..." << endl;
}

ConcreteCommand2::~ConcreteCommand2()
{
    cout << "~ConcreteCommand2..." << endl;
}

void ConcreteCommand2::Execute()
{
    this->_recv->doSomething();
}

