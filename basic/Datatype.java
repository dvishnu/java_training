public class Datatype
{
    byte b =5;
    short s =20;
    int i=10;
    long l=50;
    char c = '';
    float f=10;//32 bit
    double d=3456.67;// 64 bit
    boolean bu=true; //true or false//
    // We cannot directly access the instace variables as main method is static
    public  static void main(String[] args)
    {
        Datatype d=new Datatype(); 
        //accessing the instance variables by creating the object //
        System.out.println("value is " + d.b);
        System.out.println("value is " + d.s);
        System.out.println("value is " + d.i);
        System.out.println("value is " + d.l);
        System.out.println("value is " + d.c);
        System.out.println("value is " + d.f);
        System.out.println("value is " + d.d);
        System.out.println("value is " + d.bu);
    }


}