class insurance5
{
public static void main(String args[])
	{
            String health="excellent",location="city",gender="female";
             int age=30;
              double premium,policyamount=90000;
       if(health=="excellent" && location=="city" && gender=="male" &&  age>=25 && age<=35 && policyamount<=200000)
                         {
                        premium=4*policyamount/1000;
                          System.out.println(premium);
                          }
                         else if(health=="excellent" && location=="city" && gender=="female" &&  age>=25 && age<=35 && policyamount<=100000)
                          {
                         premium=3.0*policyamount/1000;
                           System.out.println(premium);
                           }
                           else if(health=="poor" &&  location=="village" && gender=="male" && age>=25 && age<=35 && policyamount<=10000)
                          {
                          premium=6.0*policyamount/1000;
                           System.out.println(premium);
                          }
                          else
                          {
                            System.out.println("notinsurenced");
                           }
           



}
}