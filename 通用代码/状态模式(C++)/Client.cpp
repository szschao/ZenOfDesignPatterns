#include "Context.h"
#include "ConcreteState1.h"
#include "ConcreteState2.h"

int main(){
    cout << "-------------------------------" << endl;
    //定义环境角色
    Context* pContext = new Context();
    cout << "-------------------------------" << endl;
    //初始化状态
    pContext->SetCurrentState(Context::pSTATE1);
    //行为执行
    pContext->Handle1();
    pContext->Handle2();
    cout << "-------------------------------" << endl;
    delete pContext;

    return 0;
}
