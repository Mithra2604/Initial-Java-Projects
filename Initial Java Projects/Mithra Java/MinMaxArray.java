public class MinMaxArray
{
	public static void main(String args[])
	{
		int array[]={2,23,14,77,88,62,01};
		int min=array[0];
		int max=array[0];
		for (int i=1; i < array.length; i++)
		{
			if (array[i]>max)
			{
				max=array[i];
			}
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println("The Minimum No is"+ min);
		System.out.println("The Maximum No is"+ max);
	}
}
