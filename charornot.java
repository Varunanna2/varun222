class even
{
  public static void main(String args[])
{
char temp='A';
int temp1=(int)temp;//65
System.out.println(temp1);//65
if(temp1>=65)//65>=65>>true
{
   if(temp1<=90)//65<=90>>true
    {
     temp1 = temp1+ 32;//65+32=97
     System.out.println((char)temp1);//(char)97==a
     }
   else 
     {
      temp1 = temp1- 32;
     System.out.println((char)temp1);
      }
   }
}
}