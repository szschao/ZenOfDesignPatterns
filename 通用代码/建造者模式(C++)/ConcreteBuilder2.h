#pragma once
#include <iostream>
#include "Builder.h"
#include "Product.h"
using namespace std;
//ConcreteBuilder1与ConcreteBuilder2是Builder的两个派生类，用于实现两种不同的建造细节
//  Builder的派生类,实现BuilderPartA和BuilderPartB和BuildPartC接口函数
class ConcreteBuilder2:public Builder
{
public:
    ConcreteBuilder2();
    ~ConcreteBuilder2();
	//设置产品零件
    virtual void SetPartA();
    virtual void SetPartB();
	//组建一个产品
    virtual Product* BuildProduct();
private:
    Product* m_pProduct;
};
