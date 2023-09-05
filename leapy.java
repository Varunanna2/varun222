class leapy
{
public static void main(String args[])
{
int y=1999,m=0,n=0;
while(y<=2024)
{
if(y%12==0 && y%100!=0 || y%400==0)
 	{
	System.out.println(y +"leap");
          m++;
         System.out.println(m);
	}
        else
         {
          System.out.println(y +"notleap");
           n++;
          System.out.println(n);
        }
 
    y++;
}
}
}