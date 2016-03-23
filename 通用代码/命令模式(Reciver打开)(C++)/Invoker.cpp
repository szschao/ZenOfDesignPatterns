#include "Invoker.h"

Invoker::Invoker(void)
{
    cout << "Invoker..." << endl;
}

Invoker::~Invoker(void)
{
    cout << "~Invoker..." << endl;
}

void Invoker::SetCommand(Command* pCommand)
{
    this->_cmd = pCommand;
}

void Invoker::Action()
{
    this->_cmd->Execute();
}
