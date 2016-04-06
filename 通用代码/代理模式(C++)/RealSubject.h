#pragma once
#include "Subject.h"
class RealSubject : public Subject
{
public:
    RealSubject(void);
    ~RealSubject(void);
    virtual void Request(void);
};
