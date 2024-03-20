import java.util.*;

public class DynamicObjAryCls 
{
	static Scanner num = new Scanner(System.in);
	static ArrayList<Employee> ary1=new ArrayList<Employee>();
	
	public static void main(String[] args) 
	{
		//ArrayList<Employee> ary1=new ArrayList<Employee>();
		Employee Emp=new Employee();
		
		System.out.println("Even a Array Size:");
		int x=num.nextInt();
		
		while(x<=0)
		{
			System.out.println("Even Positive Number");
			System.out.println("Even a Array Size:");
			x=num.nextInt();
		}
		
		for(int i=1; i<=x; i++)
		{				
			ary1.add(EmpObj());					
		}
		
		EmpArrayList();
				
	}
	static Employee EmpObj()
		{
			Employee Emp1=new Employee();
			
			System.out.println("Enter EmpId:");			
			Integer Id=num.nextInt();	
			Emp1.setEmpId(Id);
			
			System.out.println("Enter EmpName:");			
			String Name=num.next();	
			Emp1.setEmpName(Name);
			
			System.out.println("Enter EmpAge:");			
			Integer Age=num.nextInt();	
			Emp1.setEmpAge(Age);
			return Emp1;
		}
		
	static void EmpArrayList()
	{
		for (Employee EmpList : ary1) 
		{
			System.out.println("EmpId: " + EmpList.getEmpId()+" EmpName:"+ EmpList.getEmpName()+" EmpAge: "+ EmpList.getEmpAge());
		}
		//return EmpList;	
	}		
	
}

class Employee
	{
		private int EmpId;
		private String EmpName;
		private int EmpAge;
		
		//Getter and Setter for EmpId
		 public int getEmpId()   
		{  
			return EmpId;  
		}  
		public void setEmpId(int EmpId)   
		{  
			this.EmpId = EmpId;  
		} 
		
		//Getter and Setter for EmpName
		public String getEmpName()   
		{  
			return EmpName;  
		}  
		public void setEmpName(String EmpName)   
		{  
			this.EmpName = EmpName;  
		}
		
		//Getter and Setter for EmpAge
		public int getEmpAge()   
		{  
			return EmpAge;  
		}  
		public void setEmpAge(int EmpAge)   
		{  
			this.EmpAge = EmpAge;  
		}
		
	}
	