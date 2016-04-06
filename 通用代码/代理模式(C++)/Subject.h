#pragma once
class Subject
{
public:
    Subject(void);
    virtual ~Subject(void);
    virtual void Request() = 0;
};
