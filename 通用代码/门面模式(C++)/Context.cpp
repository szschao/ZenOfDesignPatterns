#include "Context.h"

using namespace std;

Context::Context()
{
    this->_a = new ClassA();
    this->_b = new ClassB();
}

Context::~Context()
{
    delete this->_a;
    delete this->_b;

    this->_a = NULL;
    this->_b = NULL;
}

void Context::complexMethod()
{
    cout << "委托处理复杂的计算" << endl;
    this->_a->doSomethingA();
    this->_b->doSomethingB();
}
