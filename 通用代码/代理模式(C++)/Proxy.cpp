#include "Proxy.h"
#include "RealSubject.h"
#include <iostream>
using namespace std;
//默认的代理
Proxy::Proxy():_subject(NULL)
{
    cout << "Proxy..." << endl;
    this->_subject = new RealSubject();
}
//通过构造函数传递代理
Proxy::Proxy(Subject *pSubject)
{
    cout << "Proxy..." << endl;
    this->_subject = pSubject;
}
Proxy::~Proxy(void)
{
    delete this->_subject;
    this->_subject = NULL;
    cout << "~Proxy..." << endl;
}
void Proxy::Request()
{
	this->Before();
    this->_subject->Request();
	this->After();
}

void Proxy::Before()
{
    cout << "Proxy::Before" << endl;
}

void Proxy::After()
{
    cout << "Proxy::After" << endl;
}
