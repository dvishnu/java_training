class final_variable
{
 final int PRICE_MIN = 999;
 final int PRICE_MAX = 5678;	//final variable
 
 final void display()	//final method
 {
  System.out.println("Min Price is" + PRICE_MIN);
  System.out.println("Max Price is" + PRICE_MAX );
 }

 public static void main(String[] args)
 {
     final_variable f =new final_variable();
     f.display();
 }
}