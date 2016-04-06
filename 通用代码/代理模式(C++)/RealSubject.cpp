#include "RealSubject.h"
#include <iostream>
using namespace std;
RealSubject::RealSubject(void)
{
    cout << "RealSubject..." << endl;
}
RealSubject::~RealSubject(void)
{
    cout << "~RealSubject..." << endl;
}
void RealSubject::Request(void)
{
    //业务处理逻辑
    cout << "RealSubject::Request" << endl;
}
