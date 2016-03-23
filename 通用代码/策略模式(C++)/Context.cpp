#include "Context.h"
Context::Context(Strategy* strategy)
{
    this->_strategy = strategy;
}

Context::~Context()
{
    delete this->_strategy;
    this->_strategy = NULL;
}

void Context::doAnything()
{
    this->_strategy->doSomething();
}
