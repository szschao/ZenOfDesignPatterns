#pragma once
using namespace std;
#include <iostream>
class Strategy
{
public:
    virtual ~Strategy(void);
    virtual void doSomething(void)=0;
protected:
    Strategy(void);
private:
};
