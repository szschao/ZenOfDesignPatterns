#include "Context.h"
Context::Context(Strategy* strategy)
{
    this->_strategy = strategy;
    cout << "Context..." << endl;
}

Context::~Context()
{
    delete this->_strategy;
    this->_strategy = NULL;
    cout << "~Context..." << endl;
}

void Context::doAnything()
{
    this->_strategy->doSomething();
}
