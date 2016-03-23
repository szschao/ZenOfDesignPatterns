#include "Decorator.h"

using namespace std;

//通过构造函数穿戴被修饰者
Decorator::Decorator(Component* component)
{
	cout << "Decorator Construct" << endl;
    this->_component = component;
}

void Decorator::SetComponent(Component* component)
{
    this->_component = component;
}

Decorator::~Decorator()
{
    cout << "~Decorator" << endl;
    delete this->_component;
    this->_component = NULL;
}
//委托给被修饰者执行
void Decorator::Operate()
{
	this->_component->Operate();
}

