#pragma once
#include "Builder.h"
#include <iostream>
using namespace std;
 // 使用Builder构建产品,构建产品的过程都一致,但是不同的builder有不同的实现
 // 这个不同的实现通过不同的Builder派生类来实现,存有一个Builder的指针,通过这个来实现多态调用
class Director
{
public:
    Director(Builder* pBuilder);
    ~Director();

    //Construct函数定义一个对象的整个构建过程,不同的部分之间的装配方式都是一致的,
    //首先构建PartA其次是PartB,只是根据不同的构建者会有不同的表示
    Product* getAProduct();
private:
    Builder* m_pBuilder;
};
