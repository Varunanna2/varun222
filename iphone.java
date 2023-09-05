class iphone
{ 
     public static void main(String[]args)
     { 
         String prod="phone14";
         double realprice=79900,discount=14,bankoffer=5,extrafee=99,exchange=7000;
         int points=2;
         double price=(realprice/100.0)*discount;
         System.out.println(price);
          double ipreal=(realprice-price);
         System.out.println("ipreal="+ipreal);
         bankoffer=(realprice/100.0)*bankoffer;
         System.out.println("bo="+bankoffer);
         double total=(realprice)-bankoffer-price-exchange+extrafee;
          System.out.println("total="+total);
         double coins=50;
         double totalcoins=total/50;
        System.out.println("tcoins="+totalcoins);
         

}
}
        