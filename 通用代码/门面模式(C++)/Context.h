#ifndef _CONTEXT_H_
#define _CONTEXT_H_
#include <iostream>
#include "CLassA.h"
#include "CLassB.h"

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
#endif
