class shortnames
{
public static void main(String X[])
{
int i;
String w=" ";
System.out.println("enter your full name");
String name=System.console().readLine();
name=" "+name;
int p=name.lastIndexOf(" ");
String LastName=name.substring(p);
for(i=0;i<p;i++)
{
char ch=name.charAt(i);
if(ch==' ')
{
char d=name.charAt(i+1);
w=w+d+".";
}
}
w=w+LastName;
System.out.print(w);
}
}

