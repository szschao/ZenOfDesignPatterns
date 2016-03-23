#pragma once
using namespace std;
#include <iostream>

class Command
{
public:
    virtual ~Command();
    //每个命令类都必须有一个执行命令的方法
    virtual void Execute()=0;
protected:
    Command();
private:
};
