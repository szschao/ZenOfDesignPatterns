#ifndef _DECORATOR_H_
#define _DECORATOR_H_
#include <iostream>
#include "Component.h"

//Decorator：装饰抽象类，继承自Component
class Decorator:public Component
{
public:
    Decorator(Component* com);
    void SetComponent(Component* com);
    virtual ~Decorator();
    virtual void Operation();
protected:
    Component* _com;
};
#endif
