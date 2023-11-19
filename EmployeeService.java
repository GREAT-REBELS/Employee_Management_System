import java.util.HashSet;
import java.util.Scanner;
public class EmployeeService {
	HashSet<Employee> empset = new HashSet<Employee>();
	Employee emp1=new Employee(101, "Monesh", 24, "Developer", "IT", 35000);
	Employee emp2=new Employee(102, "Madesh", 26, "Tester","CO", 57000);
	Employee emp3=new Employee(103, "Mathesh", 20, "DevOps Eng","Admin", 50000);
	Employee emp4=new Employee(104, "Prasanna Kumar", 27, "System Eng","CO",  100000);
	Employee emp5=new Employee(105, "Sandhiya sri", 26, "System Eng","CO",  90000);
	Employee emp6=new Employee(106, "Divya", 27, "System Eng","CO",  90000);
	Employee emp7=new Employee(107, "Saran", 24, "Developer", "IT", 45000);
	public EmployeeService()
	{
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		empset.add(emp5);
		empset.add(emp6);
	}
	Scanner sc=new Scanner(System.in);
	boolean found = false;
	int id;
	String name;
	int age;
	String department;
	String desiganation;
	double sal;

	public void viewAllEmps() {
		System.out.println("Emplyee List: ");
		for(Employee emp : empset)
			System.out.println(emp);
	}
	public void viewEmp() {
		System.out.print("Enter Id: ");
		id = sc.nextInt();
		for(Employee emp : empset)
		{
			if(emp.getId()==id)
			{
			System.out.println(emp);
			found = true;
			}
		}
		if(!found)
		{
			System.out.println("Employee with Id "+ id +" does not exist\n");
		}
	}
	public void updateEmp() { 
		System.out.print("Enter Id: ");
		id = sc.nextInt();
		for(Employee emp : empset)
		{
			if(emp.getId()==id)
			{
			System.out.println("Enter Name: ");
			name = sc.next();
			System.out.println("Enter department: ");
			department = sc.next();
			System.out.println("Enter designation: ");
			desiganation = sc.next();
			System.out.println("Enter salary: ");
			sal = sc.nextDouble();
			emp.setName(name);
			emp.setDepartment(department);
			emp.setDesiganation(desiganation);
			emp.setSalary(sal);
			System.out.println("Updated details of the employee are :");
			System.out.println(emp);
			found = true;
			}
		}
		if(!found)
		{
			System.out.println("Employee with Id "+ id +" does not exist\n");
		}
	
	}
	public void deleteEmp() {
		System.out.print("Enter Id: ");
		id = sc.nextInt();
		found = false;
		Employee del = null;
		for(Employee emp : empset)
		{
			if(emp.getId()==id)
			{
				del = emp;
				found = true;
			 
			}
		}
		if(!found)
		{
			System.out.println("Employee with Id "+ id +" does not exist\n");
		}
		else
		{
			empset.remove(del);
			System.out.println("Employee with Id "+ id +" deleted sucessfully\n");
		}
		
	}
	public void addEmp() {
		System.out.println("Enter Id: ");
		id = sc.nextInt();
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter Age: ");
		age = sc.nextInt();
		System.out.println("Enter department: ");
		department = sc.next();
		System.out.println("Enter designation: ");
		desiganation = sc.next();
		System.out.println("Enter salary: ");
		sal = sc.nextDouble();
		
		Employee emp=new Employee(id,name,age,desiganation,department,sal);
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employee added sucessfully");
		
		
	}
	

}
