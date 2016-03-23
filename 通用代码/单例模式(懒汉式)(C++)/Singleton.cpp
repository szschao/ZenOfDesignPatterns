#include "Singleton.h"
#include <iostream>

using namespace std;

Singleton* Singleton::pInstance = NULL;

Singleton::Singleton()
{
    cout<< "Singleton..." << endl;
}

Singleton* Singleton::Instance()
{
    //TODO:考虑下线程锁
    if(NULL == pInstance)
    {
        pInstance = new Singleton();
    }
    return pInstance;
}

void Singleton::Destroy()
{
    delete pInstance;
    pInstance = NULL;
    cout<< "Destroy..." << endl;
}
