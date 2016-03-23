#include <iostream>
#include "ClassA.h"

using namespace std;

ClassA::ClassA()
{}

ClassA::~ClassA()
{}

void ClassA::doSomethingA()
{
    cout << "SubsystemA::业务逻辑" << endl;
}
