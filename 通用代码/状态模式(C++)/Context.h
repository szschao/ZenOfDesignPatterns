#pragma once
#include <iostream>
#include "State.h"
#include "ConcreteState1.h"
#include "ConcreteState2.h"
using namespace std;

//不成文的约束:
//把状体对象声明为静态常量,有几个状态对象就声明几个静态常量
//环境角色具有状态抽象角色定义的所有行为,具体执行使用委托方式
class Context
{
public:
    Context(void);
    ~Context(void);
    //定义状态
    static State* pSTATE1;
    static State* pSTATE2;
    //获得当前状态
    State* GetCurrentState();
    //设置当前状态
    void SetCurrentState(State *pCurrentState);
    //行为委托
    void Handle1();
    void Handle2();
private:
    //当前状态
    State *m_pCurrentState;
};
