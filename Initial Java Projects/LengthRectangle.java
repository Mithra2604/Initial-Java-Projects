class LengthRectangle
{
    public static void main(String[] args)
    {
		double length=55.62;
		double breath=88.747;
		area(length,breath);
        
    }
	static void area(double length,double breath)
    {
	  double area;
	  area=length*breath;
	  System.out.println("Area of a Rectangle is" + area);
    }
}
