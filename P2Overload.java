public class P2Overload
{
void myMethod(short s)
{
System.out.println("short");
}
void myMethod(int i)
{
System.out.println("int");
}
void myMethod(long l)
{
System.out.println("long");
}
public static void main(String[] args)
{
byte b = 1;

	P2Overload o = new P2Overload();
	o.myMethod(b);
	
	/*
*statement di atas akan menghasilkan "short",
*hal ini karena short lebih "dekat" dengan
*byte bila dibandingkan dengan int ataupun long
*/
}
}