#include "Decorator.h"

using namespace std;

Decorator::Decorator(Component* com)
{
    this->_com = com;
}

void Decorator::SetComponent(Component* com)
{
    this->_com = com;
}

Decorator::~Decorator()
{
    cout << "~Decorator" << endl;
    delete this->_com;
    this->_com = NULL;
}

void Decorator::Operation()
{}

