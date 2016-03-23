#pragma once
#include <iostream>
using namespace std;

class Context;
class State
{
public:
    State(void);
    virtual ~State(void);
    //设置环境角色
    void SetContext(Context *pContext);
    //定义行为
    virtual void Handle1() = 0;
    virtual void Handle2() = 0;
protected:
    //定义一个环境角色,提供子类访问
    Context *m_pContext;
};
