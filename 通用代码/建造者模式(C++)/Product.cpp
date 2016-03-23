#include "Product.h"

Product::Product()
{
	cout<<"Product..."<<endl;
}

Product::~Product()
{
	cout<<"~Product..."<<endl;
}

void Product::setPartA(const string& s)
{
    this->m_partA = s;
    cout<<s<<endl;
}

void Product::setPartB(const string& s)
{
    this->m_partB = s;
    cout<<s<<endl;
}

void Product::doSomething()
{
	//独立的业务逻辑
}
