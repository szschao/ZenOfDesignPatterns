#ifndef _CONCRETESTRATEGY1_H_
#define _CONCRETESTRATEGY1_H_
#include <iostream>
#include "Strategy.h"

class ConcreteStrategy1 : public Strategy
{
public:
    ConcreteStrategy1();
    virtual ~ConcreteStrategy1();
    virtual void doSomething();
protected:
private:
};
#endif
