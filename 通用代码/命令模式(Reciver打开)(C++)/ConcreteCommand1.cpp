#include "ConcreteCommand1.h"

ConcreteCommand1::ConcreteCommand1(Receiver* pReceiver)
{
    this->_recv = pReceiver;
    cout << "ConcreteCommand1..." << endl;
}

ConcreteCommand1::~ConcreteCommand1()
{
    cout << "~ConcreteCommand1..." << endl;
}

void ConcreteCommand1::Execute()
{
    this->_recv->doSomething();
}

