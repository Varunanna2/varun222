class div
{
public static void main(String args[])
{
int n=55;
if(n%3==0)
{
 if(n%5==0)
{
System.out.println("fizzbuzz");
}
else
{
System.out.println("fizz");
}
}
else if(n%5==0)
{
System.out.println("buzz");
}
else
{
System.out.println("neither3nor5");
}
}
}