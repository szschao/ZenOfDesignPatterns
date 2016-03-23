#include "ConcreteComponent.h"

using namespace std;

ConcreteComponent::ConcreteComponent()
{
	cout << "ConcreteComponent Construct" << endl;
}

ConcreteComponent::~ConcreteComponent()
{
    cout << "~ConcreteComponent" << endl;
}
//重写父类方法
void ConcreteComponent::Operate()
{
    cout << "原职责：do Something" << endl;
}
