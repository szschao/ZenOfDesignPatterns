#include "ClassC.h"

ClassC::ClassC()
{
    cout << "ClassC..." << endl;
}

ClassC::~ClassC()
{
    cout << "~ClassC..." << endl;
}

void ClassC::doSomethingC()
{
    cout << "SubsystemC::业务逻辑" << endl;
}
