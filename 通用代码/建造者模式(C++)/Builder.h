#pragma once
#include "Product.h"

//抽象Builder基类，定义不同部分的创建接口
class Builder
{
public:
	//设置产品的不同部分,以获得不同的产品
    virtual void SetPartA()=0;
    virtual void SetPartB()=0;
	//建造产品
    virtual Product* BuildProduct()=0;
    Builder();
    virtual ~Builder();
};
