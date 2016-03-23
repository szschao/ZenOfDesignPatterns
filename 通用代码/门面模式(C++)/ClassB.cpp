#include "ClassB.h"

ClassB::ClassB()
{
    cout << "ClassB..." << endl;
}

ClassB::~ClassB()
{
    cout << "~ClassB..." << endl;
}

void ClassB::doSomethingB()
{
    cout << "SubsystemB::业务逻辑" << endl;
}

