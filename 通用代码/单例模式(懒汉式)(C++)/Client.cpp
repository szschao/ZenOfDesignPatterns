#include "Singleton.h"
#include <iostream>

using namespace std;

int main()
{
    Singleton* ps = Singleton::GetInstance();//通过全局访问点获取实例
    Singleton::ReleaseInstance();
    return 0;
}
