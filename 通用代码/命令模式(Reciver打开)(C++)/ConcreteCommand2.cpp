#include "ConcreteCommand2.h"
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

