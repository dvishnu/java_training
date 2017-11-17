class dog
{
    void shout()
    {
        System.out.println("Shout");
    }
    void Bark()
    {
        System.out.println("Bark");
    }
    public static void main (String[] args) {
        dog d1=new dog();
        dog d2=new dog();
        d2.Bark();
        d2.shout();
        d1.shout();
    }
}

