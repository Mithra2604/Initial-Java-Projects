public class TestOverload
{
	public static void main(String args[])
	{
		/*
		print(13);
		
		*/
		//int no;
		//TestOverload objnew= new TestOverload();
		print();
		print(58.96);
		print("Mithra");
	}
	public static void print()
	{
		int no=12;
		System.out.println(no);
	}
	
	static void print(double number)
	{
		System.out.println(number);
	}
	static void print(String name)
	{
		System.out.println(name);
	}
}