#include "Singleton.h"
#include <iostream>

using namespace std;

Singleton* Singleton::pInstance = NULL;

Singleton::Singleton()
{
    cout<< "CreateInstance" << endl;
}

Singleton::~Singleton()
{
}

Singleton* Singleton::GetInstance()
{
    //TODO:考虑下线程锁
    if(NULL == pInstance)
    {
        pInstance = new Singleton();
    }
    return pInstance;
}

void Singleton::ReleaseInstance()
{
    delete pInstance;
    pInstance = NULL;
    cout<< "ReleaseInstance..." << endl;
}
