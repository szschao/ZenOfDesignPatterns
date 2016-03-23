#include "Facade.h"

int main()
{
    Facade* pFacade = new Facade();
    //可以完整的访问所有业务逻辑
    pFacade->methodA();
    pFacade->methodB();
    pFacade->methodC();
    pFacade->methodD();
    return 0;
}
