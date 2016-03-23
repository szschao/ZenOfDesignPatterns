#pragma once
using namespace std;
#include <iostream>
#include "Receiver.h"
class ConcreteReceiver1 : public Receiver
{
public:
    ConcreteReceiver1();
    virtual ~ConcreteReceiver1();
    virtual void doSomething();
protected:
private:
};

