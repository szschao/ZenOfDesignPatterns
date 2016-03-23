#include "Director.h"
#include "ConcreteBuilder1.h"
#include "ConcreteBuilder2.h"
using namespace std;

int main()
{
    cout << "-------------------------------" << endl;
    Director* pDirector1 = new Director(new ConcreteBuilder1());
    cout << "-------------------------------" << endl;
    pDirector1->getAProduct();
    cout << "-------------------------------" << endl;
	delete pDirector1;

    cout << "-------------------------------" << endl;
    Director* pDirector2 = new Director(new ConcreteBuilder2());
    cout << "-------------------------------" << endl;
    pDirector2->getAProduct();
    cout << "-------------------------------" << endl;
	delete pDirector2;

    return 0;
}
