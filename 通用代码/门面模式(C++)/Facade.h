#include <iostream>
#include "ClassA.h"
#include "ClassB.h"
#include "ClassC.h"
#include "Context.h"

class Facade
{
public:
    Facade();
    ~Facade();
    //提供给外部访问的方法
    void methodA();
    void methodB();
    void methodC();
    void methodD();
private:
    //被委托的对象
    ClassA* _a;
    ClassB* _b;
    ClassC* _c;
    Context* _context;
};
