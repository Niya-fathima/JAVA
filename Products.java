import java.util.Scanner;
class Product{
int pcode,pprice;
String pname;
Product(int pcode,String pname,int pprice)
{
this.pcode=pcode;
this.pname=pname;
this.pprice=pprice;
}
}
class Products{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("product code=");
int pcode=sc.nextInt();
System.out.println("product name=");
String pname=sc.next();
System.out.println("product price=");
int pprice=sc.nextInt();

Product[] ps=new Product[3];
ps[0]=new Product(pcode,pname,pprice);
ps[1]=new Product(101,"book",200);
ps[2]=new Product(102,"text",400);
int minprice=ps[0].pprice;
System.out.println("*********************************************");
System.out.println("\npcode\tpname\tpprice");
System.out.println("*********************************************");
for(Product p:ps)
{
if(minprice>p.pprice)
{
minprice=p.pprice;
}}
System.out.println("low cost product:");
for(Product p:ps)
{
if(minprice==p.pprice)
{
System.out.println("product code="+p.pcode);
System.out.println("product name="+p.pname);
System.out.println("product price="+p.pprice);
}
}
}
}

