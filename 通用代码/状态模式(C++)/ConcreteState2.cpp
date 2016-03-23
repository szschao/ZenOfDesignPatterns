#include "ConcreteState2.h"

ConcreteState2::ConcreteState2(void)
{
    cout<<"ConcreteState2..."<<endl;
}

ConcreteState2::~ConcreteState2(void)
{
    cout<<"~ConcreteState2..."<<endl;
}

//Override
void ConcreteState2::Handle1()
{
    //设置当前状态为State1
    this->State::m_pContext->SetCurrentState(Context::pSTATE1);
    //过渡到state1状态,由Context实现
    this->State::m_pContext->GetCurrentState()->Handle1();
}

//Override
void ConcreteState2::Handle2()
{
    cout<<"状态2下必须处理的逻辑"<<endl;
}
