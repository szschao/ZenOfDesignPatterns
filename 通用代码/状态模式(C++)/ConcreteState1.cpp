#include "ConcreteState1.h"

ConcreteState1::ConcreteState1(void)
{
    cout<<"ConcreteState1..."<<endl;
}

ConcreteState1::~ConcreteState1(void)
{
    cout<<"~ConcreteState1..."<<endl;
}

//Override
void ConcreteState1::Handle1()
{
    cout<<"状态1下必须处理的逻辑"<<endl;
}

//Override
void ConcreteState1::Handle2()
{
    //设置当前状态为State2
    this->State::m_pContext->SetCurrentState(Context::pSTATE2);
    //过渡到state2状态,由Context实现
    this->State::m_pContext->GetCurrentState()->Handle2();
}
