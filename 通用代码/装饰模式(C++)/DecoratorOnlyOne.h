#ifndef _DECORATERONLYONE_H_
#define _DECORATERONLYONE_H_
#include "Component.h"
//只添加一种装饰，则不用抽象出装饰基类
class DecoratorOnlyOne:public Component
{
public:
    DecoratorOnlyOne(Component* com);
    ~DecoratorOnlyOne();
    virtual void Operation();
    void AddBehavor();
private:
    Component* _com;
};

//如果只有一个ConcreteComponent类而没有抽象的Component类，那么Decorator类可以是ConcreteComponent的一个子类。
//略
#endif
