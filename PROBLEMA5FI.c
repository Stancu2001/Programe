#include <stdio.h>

int n,m,a[256][256],v[65537],i,j,k;

void main()
{
   printf ("n= ");
    scanf ("%i", &n);
    printf ("m= ");
    scanf ("%i", &m);

     while ((n <= 0 || n > 256)||(m <= 0 || m > 256))
    {
        if((n <= 0 || n > 256)&&(m <= 0 || m > 256))

        {

            printf(" Valorile citite sunt mai mici decat 0 sau mai mari de 256 ");
            printf ("\n Recititi alte valori ");
            printf ("\nn= ");
            scanf ("%i", &n);
            printf ("m= ");
            scanf ("%i", &m);
        }

        else if(n <= 0 || n > 256)

        {

            printf(" Valoarea citita pentru n este mai mica decat 0 sau mai mare de 256 ");
            printf ("\n Recititi alta valoare pentru n ");
            printf ("\nn= ");
            scanf ("%i", &n);

        }

        else

        {

            printf(" Valoarea citita pentru m este mai mica decat 0 sau mai mare de 256 ");
            printf ("\n Recititi alta valoare pentru m ");
            printf ("\nm= ");
            scanf ("%i", &m);

        }
    }

    for(i=1; i<=n; i++)
    {
        for(j=1;j<=m; j++)
        {
            printf ("a[%d][%d]= ",i,j);
            scanf ("%i", &a[i][j]);
        }
    }

    printf("\n");
    for(i=1; i<=n; i++)
    {
        for(j=1;j<=m; j++)
        {
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }

    for(i=1; i<=n*m; i++)
    {
        if(i%m==0)
            v[i]=a[i/m][m];
            else
            v[i]=a[i/m+1][i%m];
    }

    scanf("%d %d",&k,&j);
    for(i=1; i<=n*m; i++)
    {
        if(j%m==0)
        {
            if(i==k*j)
            {
                printf("%d ",v[i]);
                break;
            }
        }
        else
        {
            printf("%d ",v[m*(k-1)+j]);
            break;
        }
    }
}
