

#include <cstdlib>
#include <iostream>

using namespace std;

int main() {
	// your code goes here
    //r=a^b
	int n;
        cout<<"Please input number testcase"<<endl;
	cin>>n;
	while(n--)
	{
	    long int a,b,r=0;
            cout<<"Input a and b"<<endl;
	    cin>>a>>b;
            if (b == 0 && a != 0){
                r=1;
            }else{
                r=1;
                for(int i=0;i<b;i++)
                {
                    r = r*a;
                }
            }
	    cout<<r<<"\n";
	}
	return 0;
}

