#include "ConcreteDecorator2.h"

using namespace std;
ConcreteDecorator2::ConcreteDecorator2(Component* com):Decorator(com)
{}

ConcreteDecorator2::~ConcreteDecorator2()
{
    cout << "~ConcreteDecorator2" << endl;
}

void ConcreteDecorator2::Operation()
{
    this->_com->Operation();
    //附加职责B
    this->AddBehavorB();
}

void ConcreteDecorator2::AddBehavorB()
{
    cout << "附加职责B：ConcreteDecorator2::AddBehavorB" << endl;
}
