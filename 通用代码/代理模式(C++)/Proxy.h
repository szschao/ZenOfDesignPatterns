#pragma once
#include "Subject.h"
class Proxy : public Subject
{
public:
	Proxy();
    Proxy(Subject *pSubject);
    ~Proxy(void);
    virtual void Request(void);

private:
	//预处理
	void Before();
	//善后处理
	void After();
    Subject *_subject;
};
