/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaclass;

/**
 *
 * @author 小官
 */
public class newClass {
public static void main(String[]text){
/*boolean b=true;
b=false;
System.out.println(b);//若要印出b=false (左邊b=是固定的 可以用字串 false 是變數)
System.out.print("b=");
System.out.println(b);
System.out.println("b=" + b);//新的解法+ 加法一邊是字串 就會自動用字串串聯兩邊 加法也有數學的角度
System.out.println("b=" + 123);
//System.out.println("b=" + ab);這卻不行

char c = 'A';//性別也可以 女 男
System.out.println(c);
c = '@';
System.out.println(c);
c = '我';
System.out.println(c);
c = '\'';//使用單引號 印出'
System.out.println(c);
c = '\\';//使用單引號 印出\
System.out.println(c);
c = '\u0775';//使用單引號 印出你要的萬國碼 Unicode
System.out.println(c);
String s ="Hello Java";
System.out.println(s);

int r =1;
int t =2;
int q;//最小運算單位32bit
q = r+t;
System.out.println("r+t=" + q);
q = r-t;
System.out.println("r-t=" + q);
q = r*t;
System.out.println("r*t" + q);
q = r/t;
System.out.println("r/t=" + q);//整數跟整數出來就整數int
q = r%t;
System.out.println("r%t" + q);//餘數

int i=1;
long l=123123456789L;
float f=0.5F;
double d=3.14;

//int + long
System.out.println(i+l);
//int +float
System.out.println(i+f);
//int+double
System.out.println(i+d);
//float+long
System.out.println(f+l);
//float+double
System.out.println(f+d);
//double+long
System.out.println(d+l);

long L=i+l;
System.out.println(L);

float F=i+f;
System.out.println(F);

float ff=f+f;
System.out.println(ff);

float fff=f+l;
System.out.println(fff);

/*double AA = 1/2;
System.out.println(AA);
double BB = 1/2f;//才會變float
System.out.println(BB);
double CC = (double)1/2;
System.out.println(CC);
double DD = ((double)1/2);
System.out.println(DD);
double EE = ((double)(1/2));
System.out.println(EE);
*///未完
/*int a1=1;
int b1;
b1=++a;

System.out.println(b1);*/
//未完
/*

*/
int a4=20,b4=10,c4=0,d4=20,e4=40,f4=30;
boolean condition=true;

c4=++a4;//A先加1 給C
System.out.println("Value of c4(++a4)="+c4);

c4=b4++;//B等於C
c4=--d4;
System.out.println("Value of c4(--d4="+c4);

c4=e4--;
System.out.println("Value of c4(e4--="+c4);
System.out.println("Value of ! condition="+!condition);

//另一題
int a=20,b=10,c,d,e=10,f=4,g=9;

c=b;
System.out.println("Value of c="+c);

a=a+1;//a=21
b=b-1;//b=9
e=e*2;//e=20
f=f/2;//f=2
System.out.println("a,b,e,f="+a+","+b+","+e+","+f);//52

a=a-1;
b=b+1;
e=e/2;
f=f*2;

a+=1;//a=21
b-=1;//b=9
e*=2;//e=20
f/=2;//f=2
System.out.println("a,b,e,f"
 + "using shorthand operators)="
+a+","+b+","+e+","+f);

	}}

