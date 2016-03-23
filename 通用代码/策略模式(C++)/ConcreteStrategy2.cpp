#include "ConcreteStrategy2.h"

ConcreteStrategy2::ConcreteStrategy2(void)
{
    cout << "ConcreteStrategy2..." << endl;
}

ConcreteStrategy2::~ConcreteStrategy2(void)
{
    cout << "~ConcreteStrategy2..." << endl;
}

void ConcreteStrategy2::doSomething(void)
{
    cout << "具体策略2的运算法则" << endl;
}

