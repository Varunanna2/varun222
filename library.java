class library
{
public static  void main(String args[])
{
String name="books";
 double day=8;
 if(day>0 && day<=5)
{
    int total1=(int)(0.5)*5;
  System.out.println(total1);
    }
else if( day>=6 && day<=10)
{
     int total2=1*5;
     System.out.println(total2);
}
else if(day>10 && day<30)
{
    int total3=5*20;
System.out.println(total3);
}
else
{
System.out.println("membrshipcancelled");
}


}
}