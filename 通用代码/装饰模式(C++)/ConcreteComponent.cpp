#include "ConcreteComponent.h"

using namespace std;

ConcreteComponent::ConcreteComponent()
{}

ConcreteComponent::~ConcreteComponent()
{
    cout << "~ConcreteComponent" << endl;
}

void ConcreteComponent::Operation()
{
    cout << "原职责：ConcreteComponent::Operation" << endl;
}
