#ifndef _CONCRETEDECORATER2_H_
#define _CONCRETEDECORATER2_H_
#include "Component.h"
#include "Decorator.h"
//ConcreteDecorator就是具体的装饰对象之二，起到给Component添加职责的功能
class ConcreteDecorator2:public Decorator
{
public:
    ConcreteDecorator2(Component* com);
    ~ConcreteDecorator2();
    virtual void Operation();
    void AddBehavorB();
};
#endif
