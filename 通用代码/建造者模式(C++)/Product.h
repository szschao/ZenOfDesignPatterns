#pragma once
#include <iostream>
#include <string>
using namespace std;
//产品类
class Product
{
private:
    string m_partA;
    string m_partB;
    string m_partC;
public:
    void setPartA(const string& s);
    void setPartB(const string& s);
    void setPartC(const string& s);
	void doSomething();
    Product();
    ~Product();
};
