#ifndef _CONCRETESTRATEGY2_H_
#define _CONCRETESTRATEGY2_H_
#include <iostream>
#include "Strategy.h"

class ConcreteStrategy2 : public Strategy
{
public:
    ConcreteStrategy2();
    virtual ~ConcreteStrategy2();
    virtual void doSomething();
protected:
private:
};
#endif
