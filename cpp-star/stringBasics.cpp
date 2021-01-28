#include <iostream>
#include <string>
using namespace std;

int main() {
	string a, b;
    cin>>a>>b;
    char t = a[0];
    cout<<a.size()<<" "<<b.size()<<endl;
    cout<<a+b<<endl;
    
    a[0] = b[0];
    b[0] = t;
    cout<<a<<" "<<b;
  
    return 0;
}
