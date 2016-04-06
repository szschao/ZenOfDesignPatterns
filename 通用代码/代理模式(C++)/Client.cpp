#include "Proxy.h"
#include "RealSubject.h"
#include "Subject.h"

int main(int argc, char const* argv[])
{
    Proxy *pProxy;

    pProxy = new Proxy(new RealSubject());
    pProxy->Request();
    delete pProxy;

    return 0;
}
