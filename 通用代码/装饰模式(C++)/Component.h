#ifndef _COMPONENT_H_
#define _COMPONENT_H_
#include <iostream>
//Component抽象类，定义该类对象的接口
class Component
{
public:
    virtual ~Component();
    virtual void Operation()=0;
protected:
    Component();
};
#endif
