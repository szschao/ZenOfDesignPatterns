#pragma once
#include <iostream>
#include "Strategy.h"
using namespace std;

class ConcreteStrategy1 : public Strategy
{
public:
    ConcreteStrategy1(void);
    virtual ~ConcreteStrategy1(void);
    virtual void doSomething(void);
protected:
private:
};
