 class poo
{
    public static void main(String[] args) {
    int a=200,b=300,c=1000;
    if(a<b)
    {
    a=a+b;
    b=a-b;
    a=a-b;
    }
    if(a<c)
    {
    a=a+c;
    c=a-c;
    a=a-c;
    }
    if(b<c) 
    { 
    b=b+c;
    c=b-c;
    b=b-c;
    }
    
    
    System.out.println("a=" +a);
    System.out.println("b=" +b);
     System.out.println("c=" +c);
}
}