// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
void print(int a){
    if(a==1){
        return;
    }
    cout<<a<<endl;
    print(a-1);
    
}
int main() {
    print(10);
    return 0;
}
