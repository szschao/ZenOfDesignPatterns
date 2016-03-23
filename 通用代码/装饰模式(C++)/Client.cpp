#include "Decorator.h"
#include "ConcreteComponent.h"
#include "ConcreteDecorator1.h"
#include "ConcreteDecorator2.h"
#include "DecoratorOnlyOne.h"
#include <iostream>

using namespace std;
int main()
{
    Component* pComponent = new ConcreteComponent();        //要装饰的对象
    cout << "-------------------------------" << endl;
    Decorator* pDecorator = NULL;
    pDecorator = new ConcreteDecorator1(pComponent);            //给装饰对象附加职责A
    cout << "-------------------------------" << endl;
    pDecorator = new ConcreteDecorator2(pDecorator);            //给装饰对象附加职责B
    cout << "-------------------------------" << endl;
    pDecorator->Operate();
    cout << "-------------------------------" << endl;
    delete pDecorator;

    //只添加一种修饰
    cout << "-------------------------------" << endl;
    Component* pCom1 = new ConcreteComponent();
    cout << "-------------------------------" << endl;
    DecoratorOnlyOne* pDec1 = new DecoratorOnlyOne(pCom1);
    cout << "-------------------------------" << endl;
    pDec1->Operate();
    cout << "-------------------------------" << endl;
    delete pDec1;

    return 0;
}
