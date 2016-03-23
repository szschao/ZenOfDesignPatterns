#include "ConcreteBuilder2.h"

ConcreteBuilder2::ConcreteBuilder2()
{
    this->m_pProduct = new Product();
    cout<<"ConcreteBuilder2..."<<endl;
}

ConcreteBuilder2::~ConcreteBuilder2()
{
    delete this->m_pProduct;
    this->m_pProduct = NULL;
	cout<<"~ConcreteBuilder2..."<<endl;
}

void ConcreteBuilder2::SetPartA()
{
	//产品类内的逻辑处理
    this->m_pProduct->setPartA("BuildPart2-A");
}

void ConcreteBuilder2::SetPartB()
{
	//产品类内的逻辑处理
    this->m_pProduct->setPartB("BuildPart2-B");
}

Product* ConcreteBuilder2::BuildProduct()
{
    return this->m_pProduct;
}

