#pragma once
#include <iostream>
//Component抽象类，定义该类对象的接口
class Component
{
public:
    virtual ~Component();
    virtual void Operate()=0;
protected:
    Component();
};
