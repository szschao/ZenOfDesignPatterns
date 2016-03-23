#include "ClassA.h"

ClassA::ClassA()
{
    cout << "ClassA..." << endl;
}

ClassA::~ClassA()
{
    cout << "~ClassA..." << endl;
}

void ClassA::doSomethingA()
{
    cout << "SubsystemA::业务逻辑" << endl;
}
