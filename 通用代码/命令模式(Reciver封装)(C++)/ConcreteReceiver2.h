#pragma once
using namespace std;
#include <iostream>
#include "Receiver.h"
class ConcreteReceiver2 : public Receiver
{
public:
    ConcreteReceiver2();
    virtual ~ConcreteReceiver2();
    virtual void doSomething();
protected:
private:
};
