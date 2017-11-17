public class Example_variables
{
    int salary; // instance variable    
    public void show()
   {
       int i=10; //local variable inside the method
       i=i + 30;
       System.out.println("the value of i is " + i);
       salary =1000;
       System.out.println("Salary is " + salary);
   }
    public static void main(String[] args)
    {
        Example_variables eg = new Example_variables();
        eg.show();
    }
}