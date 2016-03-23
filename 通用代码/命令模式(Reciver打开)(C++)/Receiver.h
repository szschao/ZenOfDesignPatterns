#pragma once
using namespace std;
#include <iostream>
class Receiver
{
public:
    Receiver();
    virtual ~Receiver();
    //抽象接收者,定义每个接收者都必须完成的业务
    virtual void doSomething()=0;
protected:
private:
};
