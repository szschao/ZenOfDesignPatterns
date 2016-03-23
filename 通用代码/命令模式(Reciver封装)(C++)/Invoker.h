#pragma once
using namespace std;
#include <iostream>
#include "Command.h"
class Invoker
{
public:
    Invoker(void);
    ~Invoker(void);
    void SetCommand(Command *pCommand);
    void Action();
protected:
private:
    Command* _cmd;
};
