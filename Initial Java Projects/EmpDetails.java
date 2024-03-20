import java.util.*;

class EmpDetails
{
	static Scanner num = new Scanner(System.in);
	static ArrayList<Employee> ary1=new ArrayList<Employee>();
	
	public static void main(String args[])
	{
		boolean header =true;
		
		while(header)
		{
			Employee Emp=new Employee();
			
			System.out.println("Enter an Employee Details in an Array \n  \n");
			System.out.println("Enter 1 for Entering an Employee Details \n");
			System.out.println("Enter 2 for Displaying  \n");
			System.out.println("Enter 3 for Updating a Field  \n");
			System.out.println("Enter 4 for Deleting a Row  \n");
			System.out.println("Enter 5 for Exit  \n");
			
			int x=num.nextInt();
			
			while(x<=0)
				{
					System.out.println("Even Positive Number");
					System.out.println("Even a Array Size:");
					x=num.nextInt();
				}

			switch (x) 
			{
				//Insert
				case 1:
					
					for(int i=1; i<=x; i++)
					{				
						ary1.add(EmpInsert());					
					}	
				break;
				
				//Display
				case 2:
					EmpView();
				break;
				
				//Update
				case 3:
					EmpUpdate();
				break;
				
				//Delete
				case 4:
					
				break;
				
				//Exit
				case 5:
					header=false;
				break;
			}		
		}				
	}
	
	//Inserting Records from Object to an ArrayList
	static Employee EmpInsert()
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
			
			System.out.println("Enter EmpCity:");			
			String City=num.next();	
			Emp1.setEmpCity(City);
			return Emp1;
		}
		
	//Viewing Records	
	static void EmpView()
	{
		for (Employee EmpList : ary1) 
		{
			System.out.println("EmpId: " + EmpList.getEmpId()+" EmpName:"+ EmpList.getEmpName()+" EmpAge: "+ EmpList.getEmpAge()+" EmpCity: "+ EmpList.getEmpCity());
		}
	}	
	
	//Updating Records
	static void EmpUpdate()
	{
		System.out.println("We can update EmpName, EmpAge and EmpCity");
		System.out.println("Enter the id to change");
		Integer input=obj.nextInt();
		for(Employee i:ar) 
		{
			while (i.getid()==input)
			{
				System.out.println("Enter New Name");
				String newinput=obj.next();
				i.setname(newinput);
				System.out.println("Enter the Age to be updated");
				Integer newinputt=obj.nextInt();
				i.setage(newinputt);
				System.out.println("Updated Array is");
				System.out.println("Id   : "+i.getid());
				System.out.println("Name : "+i.getname());
				System.out.println("Age  : "+i.getage());
				break;
			}
		}
	}
		
		//
		/*
		   public void update(int id, Scanner input)
    {
 
        if (find(id)) {
            Record rec = findRecord(id);
 
            // Display message only
            System.out.print("What is the new Employee ID? ");
            int idNumber = input.nextInt();
 
            // Display message only
            System.out.print("What is the new Student contact Number ");
            int contactNumber = input.nextInt();
            input.nextLine();
 
            // Display message only
            System.out.print("What is the new Student Name ? ");
            String name = input.nextLine();
 
            rec.setIdNumber(idNumber);
            rec.setName(name);
            rec.setContactNumber(contactNumber);
            System.out.println("Record Updated Successfully");
        }
        else 
		{ 
            System.out.println("Record Not Found in the Student list");
        }
    }
	*/
	//
	
	}	
	
//}

class Employee
	{
		private int EmpId;
		private String EmpName;
		private int EmpAge;
		private String EmpCity;
		
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
		//Getter and Setter for EmpCity
		public String getEmpCity()   
		{  
			return EmpCity;  
		}  
		public void setEmpCity(String EmpCity)   
		{  
			this.EmpCity = EmpCity;  
		}
		
	}
	
