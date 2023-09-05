class boatwatch
{
     public static void main(String [] args)
     {
           String name="boatwatch",type="beatxp",colour="black";
           double totalprice=6999;
           System.out.println("name="+name);
           System.out.println("type="+type);
           System.out.println("colour="+colour);
           System.out.println("totalprice="+totalprice);
           double discount=(totalprice/100.0)*79;
           System.out.println("discount="+discount);
           double realprice=(totalprice-discount);
            System.out.println("realprice="+realprice);
           double quantity=2;
           double exchange=500;
           System.out.println("quantity="+quantity);
           System.out.println("exchange="+exchange);
           double twowa=(realprice*quantity);
           System.out.println("twowa="+twowa);
           double boatfivedis=(realprice/100.0)*5;
           System.out.println("boatfivedis="+boatfivedis);
           double actualprice=(twowa-boatfivedis);
           System.out.println("actualprice="+actualprice);
           double  endprice=(actualprice-exchange);
           System.out.println("endprice="+endprice); 
          double singlewatchprice=(endprice/quantity);
          System.out.println("singlewatchprice="+singlewatchprice); 
                 
}
}
           

