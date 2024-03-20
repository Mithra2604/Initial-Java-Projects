import java.util.*;

public class TestObjArrayClass 
{
	public static void main(String[] args) 
	{
		Scanner num = new Scanner(System.in);
		ArrayList<Employee> ary1=new ArrayList<Employee>();

		Employee Emp=new Employee();
		Emp.setEmpId(001);
		Emp.setEmpName("XXX");
		Emp.setEmpAge(35);
		
		Employee Emp1=new Employee();
		Emp1.setEmpId(002);
		Emp1.setEmpName("YYY");
		Emp1.setEmpAge(40);
		
		ary1.add(Emp);
		ary1.add(Emp1);
		
		for (Employee EmpList : ary1) 
		{
            System.out.println("EmpId: " + EmpList.getEmpId());
			System.out.println("EmpName: " + EmpList.getEmpName());
			System.out.println("EmpAge: " + EmpList.getEmpAge());
        }
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