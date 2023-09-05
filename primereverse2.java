class primereverse
{
   public static void main(String args[])
{
    int end=1,num=6,count=0;
    while(num>=end)
  {
    if(num%end==0)
    {
      count++;
	}
{
       end++;
}
}
       System.out.println(count);
    if(count==2)
      System.out.println("primenumber");
     else
     System.out.println("notprime");
}
}