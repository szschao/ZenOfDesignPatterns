#pragma once
using namespace std;
#include <iostream>

#include "ClassA.h"
#include "ClassB.h"

//门面不参与子系统的业务逻辑
class Context
{
public:
    Context();
    ~Context();
    //复杂的计算
    void complexMethod();
private:
    //被委托的对象
    ClassA* _a;
    ClassB* _b;
};
