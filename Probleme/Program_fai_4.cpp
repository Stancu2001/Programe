#include <iostream>
#include <iomanip>
using namespace std;
void VLP(int n)          // Verificare Liber Patrate
{
    int i,ok=1;
    i=2;
    while(i*i<=n)
    {
        if(n%(i*i)==0)
        {
            ok=0;
            break;
        }
        i++;
    }
    if(ok==1)
    {
        for(i=1;i<=n;i++)
        if(n%i==0)
        cout<<n/i<<" ";
    }
    else
    cout<<"Numarul "<<n<<" nu este liber de patrate";
}

int Prim (int p)
{
    for(int i=2; i*i<=p; i++)
    {
        if(p%i==0) return 0;
    }
    return 1;
}

void Div_luiX(int a)
{
    for(int i=1;i<=a;i++)
            if(a%i==0)
                cout<<setw(4)<<i;
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

void Putere(int n)
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
    cout<<endl<<endl;

    cout<<"SUBPUNCTUL C"<<endl<<endl;
   cout<<"Tabela CMMDC este"<<endl<<endl;
cout<<setw(3)<<"&&";
    Div_luiX(a);
    cout<<endl<<endl;
    for(int i=1; i<=a; i++)
        if(a%i==0)
        {
            cout<<setw(3)<<i;
            for(int j=1; j<=a; j++)
                if(a%j==0){
                    cout<<setw(4)<<Cmmdc(i,j);
}
            cout<<endl;
        }
    cout<<endl<<endl;
cout<<"Tabela CMMMC este"<<endl<<endl;
    cout<<setw(3)<<"||";
    Div_luiX(a);
    cout<<endl<<endl;
    for(int i=1; i<=a; i++)
        if(a%i==0)
        {
            cout<<setw(3)<<i;
            for(int j=1; j<=a; j++)
                if(a%j==0){
                    cout<<setw(4)<<Cmmmc(i,j);
                    }
            cout<<endl;
        }



    cout<<endl<<endl;
    
cout<<"SUBPUNCTUL D"<<endl<<endl;
VLP(a);
return 0;
}
