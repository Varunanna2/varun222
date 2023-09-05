public class bank
{
    public static void main(String[]args)
    {
        int bankid=2125;
        int accountno=836757;
        String personname="ram";
        double currentbalance=22000;
        double withdrawamount=1234,cuttings=22;
        double finalbalance=currentbalance-withdrawamount-cuttings;
        System.out.println(currentbalance);
        System.out.println(withdrawamount);
        System.out.println(cuttings);
        System.out.println(withdrawamount-cuttings);
        System.out.println("total rs="+finalbalance);
    }
}