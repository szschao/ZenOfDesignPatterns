#include "Context.h"

State* Context::pSTATE1 = NULL;
State* Context::pSTATE2 = NULL;

Context::Context(void)
{
    m_pCurrentState = NULL;
    pSTATE1 = new ConcreteState1();
    pSTATE2 = new ConcreteState2();
	cout<<"Context..."<<endl;
}

Context::~Context(void)
{
    delete pSTATE1;
    pSTATE1 = NULL;
    delete pSTATE2;
    pSTATE2 = NULL;
	cout<<"~Context..."<<endl;
}

State* Context::GetCurrentState()
{
    return m_pCurrentState;
}

void Context::SetCurrentState(State *pCurrentState)
{
    this->m_pCurrentState = pCurrentState;
	//切换状态
    this->m_pCurrentState->SetContext(this);
}

//行为委托
void Context::Handle1()
{
    this->m_pCurrentState->Handle1();
}

void Context::Handle2()
{
    this->m_pCurrentState->Handle2();
}
