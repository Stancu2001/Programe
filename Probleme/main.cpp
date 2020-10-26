#include <iostream>
using namespace std;
int Prim (int p)
{
    for(int i=2; i<=p/2; i++)
    {
        if(p%i==0)
            return 0;
    }
    return 1;
}
int Putere(int n){
int k,i;
i=2;
while(n > 1)
{
k=0;
while(n % i == 0)
{
k++;
n=n/i;
}
if(k)
cout << i << " la puterea " << k << endl;
i++;
}
}
int main()
{
    int a;
    cin>>a;
    cout<<"SUBPUNCTUL a"<<endl<<endl;
    if(Prim(a)==1)
        cout<<"Numarul "<<a<<" este prim ";
    else
    {
        cout<<"Toti divizorii lui "<<a<<" sunt: "<<endl;
        for(int i=1;i<=a;i++)
            if(a%i==0)
            cout<<i<<" ";
    }
    cout<<endl<<endl<<endl;
    cout<<"SUBPUNCTUL b"<<endl<<endl;
    cout<<"Descompunerea canonica in factori primi a lui "<<a <<" este:"<<endl;
    Putere(a);
}



