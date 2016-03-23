#pragma once
using namespace std;
#include <iostream>
#include "Receiver.h"

class Command
{
public:
    //实现必须定义一个接收者
    Command();
    Command(Receiver *pReceiver);
    virtual ~Command();
    //每个命令类都必须有一个执行命令的方法
    virtual void Execute()=0;
protected:
    //定义一个子类的全局共享变量
    Receiver* _pReciever;
private:
};
