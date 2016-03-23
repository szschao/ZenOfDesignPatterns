#pragma once
#include <iostream>
#include "State.h"
#include "Context.h"
using namespace std;
class ConcreteState2 : public State
{
public:
    ConcreteState2(void);
    ~ConcreteState2(void);
    void Handle1();
    void Handle2();
};
