#pragma once
#include "Component.h"
#include "Decorator.h"
//ConcreteDecorator就是具体的装饰对象之二，起到给Component添加职责的功能
class ConcreteDecorator2:public Decorator
{
public:
    ConcreteDecorator2(Component* component);
    ~ConcreteDecorator2();
	//重写父类的operate方法
    void Operate();
private:
	//定义自己的修饰方法
    void method2();
};
