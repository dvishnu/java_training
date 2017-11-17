public class Jagged_Array
{
    public static void main(String[] args)
    {
        int arr[][]= new int[2][];//creating the 2 rows
         arr[0]= new int [3];// first row with the 3 columns
         arr[1] =new int [2];// second row with 2 columns
         int count=0;
         for(int i=0;i<arr.length;i++)
         {
             for(int j=0;j<arr[i].length ;j++)
             {
                 arr[i][j] = count++;
                 System.out.println(arr[i][j] + "");
                 System.out.println();
             }
         }
    }
}

