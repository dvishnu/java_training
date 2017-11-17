import java.util.Arrays;
public class CompareArrayContents
{
    public static void main(String[] args)
    {
        int a[] ={1,2,3};
        int b[] ={1,2,3};
        if (Arrays.equals(a,b))
        {
            System.out.println("Same");
        }
        else {
            System.out.println("Not same");
        }
    }
}