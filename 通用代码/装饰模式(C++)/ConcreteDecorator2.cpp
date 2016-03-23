#include "ConcreteDecorator2.h"

using namespace std;
ConcreteDecorator2::ConcreteDecorator2(Component* component):Decorator(component)
{
	cout << "ConcreteDecorator2 Construct" << endl;
}

ConcreteDecorator2::~ConcreteDecorator2()
{
    cout << "~ConcreteDecorator2" << endl;
}

void ConcreteDecorator2::Operate()
{
    this->_component->Operate();
    //附加职责B
    this->method2();
}

void ConcreteDecorator2::method2()
{
    cout << "附加职责B:method2 修饰" << endl;
}
