public class FinalArray
{
    int i=30;
    public static void main(String[] args)
    {
        final FinalArray a = new FinalArray();
        FinalArray b =new FinalArray();
        a=b;// cannot assign a variable to a final variable
        
        System.out.println(a.i);
    }
}