#include "ConcreteStrategy1.h"

ConcreteStrategy1::ConcreteStrategy1(void)
{
    cout << "ConcreteStrategy1..." << endl;
}

ConcreteStrategy1::~ConcreteStrategy1(void)
{
    cout << "~ConcreteStrategy1..." << endl;
}

void ConcreteStrategy1::doSomething(void)
{
    cout << "具体策略1的运算法则" << endl;
}
