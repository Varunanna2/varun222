class revee
	 {
             public static void main(String args[])
                {
                    int number=11,end=1,count=0;
                    int  start=number;
                    while(start>=end)
   			{
                           if(number%start==0)
                             {
                              count++;
                              }
                                start--;
                         }
                           if(count==2)
                           {
                              	System.out.println("prime");
			    }
                             else
                                {
                                  System.out.println("not prime");
                                 }	
		  }
          }