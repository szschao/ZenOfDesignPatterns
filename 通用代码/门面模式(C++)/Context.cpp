#include "Context.h"

Context::Context()
{
    this->_a = new ClassA();
    this->_b = new ClassB();
    cout << "Context..." << endl;
}

Context::~Context()
{
    delete this->_a;
    delete this->_b;

    this->_a = NULL;
    this->_b = NULL;
    cout << "~Context..." << endl;
}

void Context::complexMethod()
{
    cout << "委托处理复杂的计算" << endl;
    this->_a->doSomethingA();
    this->_b->doSomethingB();
}
