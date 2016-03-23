#include "ConcreteCommand1.h"

ConcreteCommand1::ConcreteCommand1(void)
{
    //声明自己的默认接收者
    this->Command::_pReciever = new ConcreteReceiver1();
    cout << "ConcreteCommand1..." << endl;
}

ConcreteCommand1::ConcreteCommand1(Receiver* pReceiver)
{
    this->Command::_pReciever = pReceiver;
    cout << "ConcreteCommand1..." << endl;
}

ConcreteCommand1::~ConcreteCommand1()
{
    cout << "~ConcreteCommand1..." << endl;
}

void ConcreteCommand1::Execute()
{
    this->Command::_pReciever->doSomething();
}

