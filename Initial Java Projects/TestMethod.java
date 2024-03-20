class TestMethod 
{
    public static void main(String[] args)
    {
        int num = 5;
        System.out.println("Factorial of " + num  + " is " + factorial(5));
    }
	static int factorial(int n)
    {
        if (n == 0)
        return 1;
        return n * factorial(n - 1);
    }
}

/*
class TestMethod 
{
    static int factorial(int n)
    {
        if (n == 0)
        int count= 1;
        System.out.println(n * factorial(n - 1));
    }
    public static void main(String[] args)
    {
        int num = 5;
        System.out.println("Factorial of " + num  + " is " + factorial(5));
    }
}
*/