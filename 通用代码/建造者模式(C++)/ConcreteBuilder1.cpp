#include "ConcreteBuilder1.h"

ConcreteBuilder1::ConcreteBuilder1()
{
    this->m_pProduct = new Product();
    cout<<"ConcreteBuilder1..."<<endl;
}

ConcreteBuilder1::~ConcreteBuilder1()
{
    delete this->m_pProduct;
    this->m_pProduct = NULL;
	cout<<"~ConcreteBuilder1..."<<endl;
}

void ConcreteBuilder1::SetPartA()
{
	//产品类内的逻辑处理
    this->m_pProduct->setPartA("BuildPart1-A");
}

void ConcreteBuilder1::SetPartB()
{
	//产品类内的逻辑处理
    this->m_pProduct->setPartB("BuildPart1-B");
}

Product* ConcreteBuilder1::BuildProduct()
{
    return this->m_pProduct;
}

