#include <iostream>

using namespace std;

int Prim (int p)
{
    for(int i=2; i<=p/2; i++)
    {
        if(p%i==0) return 0;
    }
    return 1;
}

void Div_luiX(int a)
{
    for(int i=1;i<=a;i++)
            if(a%i==0)
                cout<<i<<" ";
}

int Cmmdc(int p,int q)
{
    while (p % q != 0)
    {
        int r = p % q;
        p = q;
        q = r;
    }
    return q;
}

int Cmmmc(int p,int q)
{
    int cm=(p*q)/Cmmdc(p,q);
    return cm;
}

int Putere(int n)
{
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

    cout<<"SUBPUNCTUL A"<<endl<<endl;
    if(Prim(a)==1)
        cout<<"Numarul "<<a<<" este prim ";
    else
    {
        cout<<"Toti divizorii lui "<<a<<" sunt: "<<endl;
        Div_luiX(a);

    }
    cout<<endl<<endl<<endl;

    cout<<"SUBPUNCTUL B"<<endl<<endl;
    cout<<"Descompunerea canonica in factori primi a lui "<<a <<" este:"<<endl;
    Putere(a);
    cout<<endl<<endl<<endl;

    cout<<"SUBPUNCTUL C"<<endl<<endl;
    //cmmdc
    cout<<"^ | ";
    Div_luiX(a);
    cout<<endl;
    for(int i=1; i<=a+a/2; i++)
        cout<<"-";
    cout<<endl;
    for(int i=1; i<=a; i++)
        if(a%i==0)
        {
            cout<<i<<" | ";
            for(int j=1; j<=a; j++)
                if(a%j==0){
                    cout<<Cmmdc(i,j)<<" ";
                }
            cout<<endl;
        }

    cout<<endl<<endl<<endl;

    //cmmmc
    cout<<"^ | ";
    Div_luiX(a);
    cout<<endl;
    for(int i=1; i<=a+a/2; i++)
        cout<<"-";
    cout<<endl;
    for(int i=1; i<=a; i++)
        if(a%i==0)
        {
            cout<<i<<" | ";
            for(int j=1; j<=a; j++)
                if(a%j==0){
                    cout<<Cmmmc(i,j)<<" ";
                }
            cout<<endl;
        }



    cout<<endl<<endl<<endl;

}
