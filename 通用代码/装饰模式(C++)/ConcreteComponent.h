#ifndef _CONCRETECOMPONENT_H_
#define _CONCRETECOMPONENT_H_
#include <iostream>
#include "Component.h"

//ConcreteDecorator：具体的Component对象，可以给该对象动态 添加职责
class ConcreteComponent:public Component
{
public:
    ConcreteComponent();
    ~ConcreteComponent();
    virtual void Operation();
};

#endif
