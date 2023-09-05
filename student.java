public class student
{
    public static void main(String[]args)
    {
        int s1=99,s2=98,s3=99,s4=95,s5=96,s6=95;
        double sub=100;
        int total=s1+s2+s3+s4+s5+s6;
        double percentage=(total/600.0)*100;
        double s1percentage=(s1/sub)*100.0;
        double s2percentage=(s2/sub)*100.0;
        double s3percentage=(s3/sub)*100.0;
        double s4percentage=(s4/sub)*100.0;
        double s5percentage=(s5/sub)*100.0;
        double s6percentage=(s6/sub)*100.0;
        double avg=(s1percentage+s2percentage+s3percentage+s4percentage+s5percentage+s6percentage)/6;
        System.out.println(s1percentage);
        System.out.println(s2percentage);
        System.out.println(s3percentage);
        System.out.println(s4percentage);
        System.out.println(s5percentage);
        System.out.println(s6percentage);
        System.out.println(avg);
        System.out.println(percentage);
        System.out.println(percentage-avg);
    }
}
