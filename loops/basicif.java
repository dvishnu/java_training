class basicif
{
    public static void main (String[] args) {
        int i=100;
        if (i < 50)
        {
            System.out.println("value is  invalid");
        }
        if(i >50 && i < 120)
        //nested if
        {
            System.out.println("value lies between 50 and 120");
        }
        else{
            System.out.println("value is valid");
        }
    }
}

