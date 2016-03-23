#include "State.h"

State::State(void)
{
    cout<<"State..."<<endl;
}

State::~State(void)
{
    cout<<"~State..."<<endl;
}

void State::SetContext(Context *pContext)
{
    m_pContext = pContext;
}
