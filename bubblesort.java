class bubblesort 
{
void bubblesort(int a[])
{
int i,j,t=0,n=9;
//int A[]={7,9,6,8,4,2,3,1,5};
for(i=0;i<n-1;i++)
	{
	for(j=0;j<n-i-1;j++)
		{
		if(a[j]>a[j+1])
			{
			t=a[j];
			a[j]=a[j+1];
			a[j+1]=t;
			}
		}
	}

/*for(i=0;i<A.length;i++)
{
System.out.println(A[i]+"");
}*/
}

public static void main(String X[])
{
int A[]={7,9,6,8,4,2,3,1,5};

bubblesort  bs = new bubblesort();
bs.bubblesort(A);
for(int i=0;i<A.length;i++)
{
System.out.println(A[i]+"");
}
}
}