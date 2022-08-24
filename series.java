class series
{
int n;
void input()
{
System.out.println("enter no. upto which you want the series");
this.n=Integer.parseInt(System.console().readLine());
}
void series1()
{
int i,r=0;
for(i=1;i<=n;i++)
{
r=i*i-1;
System.out.print(r+",");
}
}
void perfectnotperfect()
{
int i,j,s=0;
for(i=1;i<=n;i++)
{
s=0;
for(j=1;j<i;j++)
{
if(i%j==0)
{
s=s+j;
}
}

if(s==i)
{
System.out.println(i+"perfect");
}
else
{
System.out.println(i+"not perfect");
}
}
}
void buzzno()
{
if(n%7==0 || n%10==7)
{
System.out.println("buzz no."+n);
}
else
{
System.out.println(n+"not a buzz no.");
}
}
void pythagoreantriplets()
{
	int i,a,b,c;
	for(i=0;i<n;i++)
	{
	a=i;
	b=i+1;
	c=i+2;
				if((a*a+b*b)==c*c)
				{
						System.out.println("pythagorean triplets are"+a+","+b+","+c);
				}
	}
}

public static void main(String X[])
{
series p1=new series();
p1.input();
System.out.println();
p1.series1();
System.out.println();
p1.perfectnotperfect();
System.out.println();
p1.buzzno();
System.out.println();
p1.pythagoreantriplets();
System.out.println();
}
}