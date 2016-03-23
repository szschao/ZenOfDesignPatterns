#include "Facade.h"

Facade::Facade()
{
    this->_a = new ClassA();
    this->_b = new ClassB();
    this->_c = new ClassC();
    this->_context = new Context();
}

Facade::~Facade()
{
    delete this->_a;
    delete this->_b;
    delete this->_c;
    delete this->_context;

    this->_a = NULL;
    this->_b = NULL;
    this->_c = NULL;
    this->_context = NULL;
}

void Facade::methodA(){
    this->_a->doSomethingA();
}
void Facade::methodB(){
    this->_b->doSomethingB();
}
void Facade::methodC(){
    this->_c->doSomethingC();
}
void Facade::methodD(){
    this->_context->complexMethod();
}
