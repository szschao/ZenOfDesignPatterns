#pragma once
using namespace std;
#include <iostream>
#include "Command.h"
#include "Receiver.h"
#include "ConcreteReceiver1.h"
class ConcreteCommand1 : public Command
{
public:
    ConcreteCommand1(void);
    ConcreteCommand1(Receiver* pReceiver);
    virtual ~ConcreteCommand1();
    virtual void Execute();
protected:
private:
};

