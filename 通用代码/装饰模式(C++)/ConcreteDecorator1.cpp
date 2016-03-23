#include "ConcreteDecorator1.h"

using namespace std;

ConcreteDecorator1::ConcreteDecorator1(Component* com):Decorator(com)
{}

ConcreteDecorator1::~ConcreteDecorator1()
{
    cout << "~ConcreteDecorator1" << endl;
}

void ConcreteDecorator1::Operation()
{
    this->_com->Operation();
    //附加职责A
    this->AddBehavorA();
}

void ConcreteDecorator1::AddBehavorA()
{
    cout << "附加职责A：ConcreteDecorator1::AddBehavorA" << endl;
}
