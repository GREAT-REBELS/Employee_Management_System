import java.util.Scanner;
public class Main {

	//EmployeeService service=new EmployeeService();
	static boolean check = true;
	public static void menu() {
        System.out.println("****************Welcome To Employee Managment System *********** "
        		+ "\n1. Add Employee "
        		+ "\n2.View Employee"
        		+ "\n3.Update Employee"
        		+ "\n4. Delete Employee"
        		+ "\n5.View All Employee"
        		+ "\n6. Exit ");
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		EmployeeService service=new EmployeeService();
		do 
		{
			menu();
			System.out.println("Enter Your Choice: ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Add Employee");
				service.addEmp();
				break;
			case 2:
				service.viewEmp();
				break;
			case 3:
				service.updateEmp();
				break;
			case 4:
				service.deleteEmp();
				break;
			case 5:
				service.viewAllEmps();
				break;
			case 6:
				System.out.println("Thank you for using application");
				break;
			default:
				System.out.println("Please Enter the Valid Choice");
				
			}
		}while(check);
		
	}
	 
	
}
