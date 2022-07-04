#include <bits/stdc++.h>

using namespace std;
class A{
    public:
    int a,b;
    int sum(){
        return a+b;
    }
    
};
class B: public A{
    public:
    B(int a,int b){
        this->a=a;
        this->b=b;
    }
    
    int sum(){
      return a*b;
    }
};
int main()
{
    A *obj=new B(3,7);
    cout<<obj->sum();

    return 0;
}
