class prime
{
   public static void main(String args[])
{
    int start=1,num=2,count=0;
    while(start<=num)
  {
    if(num%start==0)
    {
      start++;
	}
{
       count++;
}
}
       System.out.println(count);
    if(count==2)
      System.out.println("primenumber");
     else
     System.out.println("notprime");
}
}