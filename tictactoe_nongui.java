class tictactoe_nongui
{
void input()
{
System.out.print("user's turn");
int n=Integer.parseInt(System.console().readLine());
//System.out.println((n-1)/3);
//System.out.println((n-1)%3);

if(a[(n-1)/3][(n-1)%3]=="X" || a[(n-1)/3][(n-1)%3]=="O")
{
System.out.println("user it is already taken, enter any other place");
input();
}
else
{
a[(n-1)/3][(n-1)%3]="X";
}

}
String a[][]=new String[3][5];
void clear()
{
int i,j,k=1;
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
a[i][j]=k+"";
k++;
}
}
}
void disp()
{
for(int i=0;i<=2;i++)
{
for(int j=0;j<=2;j++)
{

System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
void cinput1()
{


double d1=Math.random()*9;
int r=(int)d1+1;
if(a[(r-1)/3][(r-1)%3]=="X" || a[(r-1)/3][(r-1)%3]=="O")
{
//System.out.println("computer it is already taken, enter any other place");
cinput();
}
else
{
System.out.println("computer's turn");
a[(r-1)/3][(r-1)%3]="O";
disp();
}

//play();
}
int  userwinning()
{
int f=0;
if((a[0][0]=="X" && a[0][1]=="X")||(a[1][2]=="X" && a[2][2]=="X")||(a[1][1]=="X" && a[2][0]=="X"))
{
//System.out.println("hello1");
if(a[0][2]!="X" && a[0][2]!="O"){a[0][2]="O";return 3;}
f=1;

}
if((a[0][0]=="X" && a[0][2]=="X")||(a[1][1]=="X" && a[2][1]=="X"))
{
//System.out.println("hello2");
if(a[0][1]!="X" && a[0][1]!="O"){a[0][1]="O";return 3;}
f=1;
}
if((a[0][1]=="X" && a[0][2]=="X")||(a[1][0]=="X" && a[2][0]=="X")||(a[1][1]=="X" && a[2][2]=="X"))
{
//System.out.println("hello3");
if(a[0][0]!="X" && a[0][0]!="O"){a[0][0]="O";return 3;}
f=1;

}
if((a[1][0]=="X" && a[1][1]=="X")||(a[0][2]=="X" && a[2][2]=="X"))
{
//System.out.println("hello4");
if(a[1][2]!="X" && a[1][2]!="O"){a[1][2]="O";return 3;}
f=1;

}
if((a[1][0]=="X" && a[1][2]=="X")||(a[0][1]=="X" && a[2][1]=="X")||(a[0][0]=="X" && a[2][2]=="X")||(a[0][2]=="X" && a[2][0]=="X"))
{
//System.out.println("hello5");
if(a[1][1]!="X" && a[1][1]!="O"){a[1][1]="O";return 3;}
f=1;

}
if((a[1][1]=="X" && a[1][2]=="X")||(a[0][0]=="X" && a[2][0]=="X"))
{
//System.out.println("hello6");
if(a[1][0]!="X" && a[1][0]!="O"){a[1][0]="O";return 3;}
f=1;

}
if((a[2][1]=="X" && a[2][2]=="X")||(a[0][0]=="X" && a[1][0]=="X")||(a[0][2]=="X" && a[1][1]=="X"))
{
//System.out.println("hello7");
if(a[2][0]!="X" && a[2][0]!="O"){a[2][0]="O";return 3;}
f=1;

}
if((a[2][0]=="X" && a[2][1]=="X")||(a[0][2]=="X" && a[1][2]=="X")||(a[0][0]=="X" && a[1][1]=="X"))
{
//System.out.println("hello8");
if(a[2][2]!="X" && a[2][2]!="O"){a[2][2]="O";return 3;}
f=1;
}
if((a[2][0]=="X" && a[2][2]=="X")||(a[0][1]=="X" && a[1][1]=="X"))
{
//System.out.println("hello9");
if(a[2][1]!="X" && a[2][1]!="O"){a[2][1]="O";return 3;}
f=1;
}
return f;
}
void cinput()
{
System.out.println("computer's turn");
// values of f are 0(two places are not filled, 1(two places are found but comp cudnt fill), 3(cmputer has inserted its value) 
int f=computerwinning();
//System.out.println(f);
if(f!=3){f=userwinning();}
//System.out.println(f);
if(f!=3)
{

double d1=Math.random()*9;
int r=(int)d1+1;
if(a[(r-1)/3][(r-1)%3]=="X" || a[(r-1)/3][(r-1)%3]=="O")
{
//System.out.println("computer it is already taken, enter any other place");
cinput();
}
else
{
a[(r-1)/3][(r-1)%3]="O";
}

}

}
int computerwinning() 
{
int f=0;
if((a[0][0]=="O" && a[0][1]=="O")||(a[1][2]=="O" && a[2][2]=="O")||(a[1][1]=="O" && a[2][0]=="O"))
{
//System.out.println("hello11");
if(a[0][2]!="X" && a[0][2]!="O"){a[0][2]="O";return 3;}
f=1;
}
if((a[0][0]=="O" && a[0][2]=="O")||(a[1][1]=="O" && a[2][1]=="O"))
{
//System.out.println("hello12");
if(a[0][1]!="X" && a[0][1]!="O"){a[0][1]="O";return 3;}
f=1;
}
if((a[0][1]=="O" && a[0][2]=="O")||(a[1][0]=="O" && a[2][0]=="O")||(a[1][1]=="O" && a[2][2]=="O"))
{
//System.out.println("hello13");
if(a[0][0]!="X" && a[0][0]!="O"){a[0][0]="O";return 3;}
f=1;
}
if((a[1][0]=="O" && a[1][1]=="O")||(a[0][2]=="O" && a[2][2]=="O"))
{
//System.out.println("hello14");
if(a[1][2]!="X" && a[1][2]!="O"){a[1][2]="O";return 3;}
f=1;
}
if((a[1][0]=="O" && a[1][2]=="O")||(a[0][1]=="O" && a[2][1]=="O")||(a[0][0]=="O" && a[2][2]=="O")||(a[0][2]=="O" && a[2][0]=="O"))
{
//System.out.println("hello15");
if(a[1][1]!="X" && a[1][1]!="O"){a[1][1]="O";return 3;}
f=1;
}
if((a[1][1]=="O" && a[1][2]=="O")||(a[0][0]=="O" && a[2][0]=="O"))
{
//System.out.println("hello16");
if(a[1][0]!="X" && a[1][0]!="O"){a[1][0]="O";return 3;}
f=1;
}
if((a[2][1]=="O" && a[2][2]=="O")||(a[0][0]=="O" && a[1][0]=="O")||(a[0][2]=="O" && a[1][1]=="O"))
{
//System.out.println("hello17");
if(a[2][0]!="X" && a[2][0]!="O"){a[2][0]="O";return 3;}
f=1;
}
if((a[2][0]=="O" && a[2][1]=="O")||(a[2][0]=="O" && a[2][1]=="O")||(a[0][0]=="O" && a[1][1]=="O"))
{
//System.out.println("hello18");
if(a[2][2]!="X" && a[2][2]!="O"){a[2][2]="O";return 3;}
f=1;
}
if((a[2][0]=="O" && a[2][2]=="O")||(a[0][1]=="O" && a[1][1]=="O"))
{
//System.out.println("hello19");
if(a[2][1]!="X" && a[2][1]!="O"){a[2][1]="O";return 3;}
f=1;
}
return f;
}
void play()
{
for(int i=0;i<4;i++)
{
input();
disp();
winning();

cinput();
disp();
winning();

} 
}
void winning()
{
int flag=2;
if(a[0][0]=="X" && a[0][1]=="X" && a[0][2]=="X")
{
flag=0;
}
else if(a[0][0]=="O" && a[0][1]=="O" && a[0][2]=="O")
{
flag=1;
}
if(a[1][0]=="X" && a[1][1]=="X" && a[1][2]=="X")
{
flag=0;
}
else if(a[1][0]=="O" && a[1][1]=="O" && a[1][2]=="O")
{
flag=1;
}
if(a[2][0]=="X" && a[2][1]=="X" && a[2][2]=="X")
{
flag=0;
}
else if(a[2][0]=="O" && a[2][1]=="O" && a[2][2]=="O")
{
flag=1;
}
if(a[0][0]=="X" && a[1][0]=="X" && a[2][0]=="X")
{
flag=0;
}
else if(a[0][0]=="O" && a[1][0]=="O" && a[2][0]=="O")
{
flag=1;
}
if(a[0][1]=="X" && a[1][1]=="X" && a[2][1]=="X")
{
flag=0;
}
else if(a[0][1]=="O" && a[1][1]=="O" && a[2][1]=="O")
{
flag=1;
}
if(a[0][2]=="X" && a[1][2]=="X" && a[2][2]=="X")
{
flag=0;
}
else if(a[0][2]=="O" && a[1][2]=="O" && a[2][2]=="O")
{
flag=1;
}
if(a[0][2]=="X" && a[1][2]=="X" && a[2][2]=="X")
{
flag=0;
}
else if(a[0][2]=="O" && a[1][2]=="O" && a[2][2]=="O")
{
flag=1;
}
if(a[0][0]=="X" && a[1][1]=="X" && a[2][2]=="X")
{
flag=0;
}
else if(a[0][0]=="O" && a[1][1]=="O" && a[2][2]=="O")
{
flag=1;
}
if(a[0][2]=="X" && a[1][1]=="X" && a[2][0]=="X")
{
flag=0;
}
else if(a[0][2]=="O" && a[1][1]=="O" && a[2][0]=="O")
{
flag=1;
}
if(flag==0)
{
System.out.println("user is winner");
System.exit(0);
}
else if(flag==1) 
{
System.out.println("computer is winner");
System.exit(0);
}

}
public static void main(String X[])
{
tictactoe_nongui t1=new tictactoe_nongui();
t1.clear();
t1.disp();
t1.play();
t1.winning();
}
}