#pragma once
#include <iostream>
#include "State.h"
#include "Context.h"
using namespace std;
class ConcreteState1 : public State
{
public:
    ConcreteState1(void);
    ~ConcreteState1(void);
    void Handle1();
    void Handle2();
};
