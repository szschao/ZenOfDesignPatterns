#pragma once
using namespace std;
#include <iostream>
#include "Strategy.h"

class ConcreteStrategy2 : public Strategy
{
public:
    ConcreteStrategy2(void);
    virtual ~ConcreteStrategy2(void);
    virtual void doSomething(void);
protected:
private:
};
