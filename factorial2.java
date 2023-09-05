class factorial2
{
	public static void main(String args[])
     {  
         int fact=1,n=5,x=1;
         while(x<=n)
        {
         fact=fact*n;
          n--;
       System.out.println(fact);
       }
    }
}