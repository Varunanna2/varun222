public class product
{
    public static void main(String[]args)
    {
        int product=22;
        String name="dmart";
        int code='b';
        int price=2200,quantity=2,coupan=234;
        double total=price*quantity;
        double discount=(2200*17)/100;
        double gst=(2200*18)/100;
        double totalp=(total-discount-coupan+gst);
        System.out.println(coupan);
        System.out.println(total);
        System.out.println(discount);
        System.out.println(gst);
        System.out.println(totalp);
        
    }
}