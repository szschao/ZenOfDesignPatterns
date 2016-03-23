#include "ConcreteDecorator1.h"

using namespace std;

ConcreteDecorator1::ConcreteDecorator1(Component* component):Decorator(component)
{
	cout << "ConcreteDecorator1 Construct" << endl;
}

ConcreteDecorator1::~ConcreteDecorator1()
{
    cout << "~ConcreteDecorator1" << endl;
}

void ConcreteDecorator1::Operate()
{
	//附加职责A
    this->method1();
    this->_component->Operate();
}

void ConcreteDecorator1::method1()
{
    cout << "附加职责A:method1 修饰" << endl;
}
