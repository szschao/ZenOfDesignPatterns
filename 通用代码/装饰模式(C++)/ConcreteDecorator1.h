#ifndef _CONCRETEDECORATOR1_H_
#define _CONCRETEDECORATOR1_H_
#include "Component.h"
#include "Decorator.h"
//ConcreteDecorator就是具体的装饰对象之一，起到给Component添加职责的功能
class ConcreteDecorator1:public Decorator
{
public:
    ConcreteDecorator1(Component* com);
    ~ConcreteDecorator1();
    virtual void Operation();
    void AddBehavorA();
};
#endif
