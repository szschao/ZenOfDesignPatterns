#pragma once
using namespace std;
#include <iostream>
#include "Command.h"
#include "Receiver.h"
class ConcreteCommand2 : public Command
{
public:
    ConcreteCommand2(Receiver* pReceiver);
    virtual ~ConcreteCommand2();
    virtual void Execute();
protected:
private:
    Receiver* _recv;
};

