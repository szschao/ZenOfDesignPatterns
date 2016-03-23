#include "DecoratorOnlyOne.h"

using namespace std;
//**************只添加一种修饰******************
DecoratorOnlyOne::DecoratorOnlyOne(Component* com):_com(com)
{
	cout << "DecoratorOnlyOne Construct" << endl;
}

DecoratorOnlyOne::~DecoratorOnlyOne()
{
    cout << "~DecoratorOnlyOne" << endl;
    delete this->_com;
    this->_com = NULL;
}

void DecoratorOnlyOne::Operate()
{
    this->_com->Operate();
    this->AddBehavor();
}

void DecoratorOnlyOne::AddBehavor()
{
    cout << "附加唯一职责：DecoratorOnlyOne::AddBehavor" << endl;
}
