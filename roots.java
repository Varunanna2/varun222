class roots
{
 public static void main(String args[])
  {
    int a=1,b=8,c=7;
    double root=(-b);
    double ro=(Math.pow(b,2))-4*a*c;
    double rr=root+Math.sqrt(ro);
    double r=2*a;
    double q = rr/r;
    System.out.println(q);
    double ss=root-Math.sqrt(ro);
    double d=ss/r;
    System.out.println(d);
}
}