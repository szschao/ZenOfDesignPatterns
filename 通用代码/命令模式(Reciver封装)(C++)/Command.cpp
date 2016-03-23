#include "Command.h"

Command::Command()
{
    cout << "Command..." << endl;
}

Command::Command(Receiver *pReceiver)
{
    cout << "Command..." << endl;
    this->_pReciever = pReceiver;
}

Command::~Command()
{
    cout << "~Command..." << endl;
    delete this->_pReciever;
    this->_pReciever = NULL;
}
