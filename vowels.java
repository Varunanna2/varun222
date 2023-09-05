class vowels
{
        public static void main(String args[])
	{
		char x='B';
		if(x>=65 && x<=90)  
		{
			if(x=='A' || x=='E' || x=='I' ||x=='O' ||x=='U')
			{
				System.out.println("vowels :"+x);
			}
			else
			{
				System.out.println("constraints"+x);
			}
		}
                else if(x>=97 && x<=122)
		{
 	             if(x=='a'|| x=='e' || x=='i' || x=='o' || x=='u')
		     {
				System.out.println("small vowels : "+x);
		     }
                     else
                     {
				System.out.println("small cons :"+x);
		     }
                  }
                 else if(x<=57 && x>=49)
                  {
                    
                         System.out.println("num");
                      
  		}
                      else
		              {
                                System.out.println("out");
                               }
                    
		
	}
}
