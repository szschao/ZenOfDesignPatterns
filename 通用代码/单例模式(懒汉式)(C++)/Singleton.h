#pragma once
#include <iostream>
using namespace std;

class Singleton
{
public:
    static Singleton* GetInstance();
    static void ReleaseInstance();

private:
    Singleton();//私有化构造函数，使其无法在类外实例化
	virtual ~Singleton();
    static Singleton* pInstance;//静态成员，保存对象的唯一实例
};
