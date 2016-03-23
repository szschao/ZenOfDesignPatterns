#pragma once
#include <iostream>
#include "Component.h"

//Decorator：装饰抽象类，继承自Component
class Decorator:public Component
{
public:
    Decorator(Component* component);
    virtual ~Decorator();
    void SetComponent(Component* component);
    void Operate();
protected:
    Component* _component;
};
