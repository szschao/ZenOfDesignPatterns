#include "Director.h"
Director::Director(Builder* pBuilder)
{
    this->m_pBuilder = pBuilder;
	cout<<"Director..."<<endl;
}

Director::~Director()
{
    delete this->m_pBuilder;
    this->m_pBuilder = NULL;
	cout<<"~Director..."<<endl;
}

//构建不同的产品
Product* Director::getAProduct()
{
    this->m_pBuilder->SetPartA();
    this->m_pBuilder->SetPartB();
	//设置不同的零件,产生不同的产品
	return m_pBuilder->BuildProduct();
}
