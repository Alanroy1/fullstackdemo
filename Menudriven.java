import java.util.*;
public class Menudriven
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	
	int choice;
	
	int id=0;;
	String name="Al";
	String des="Engineer";
	int f=1;
	while(f!=0) 

	{
		System.out.println("Enter Input 1 Or 2");
		choice=sc.nextInt();
		switch (choice)
		{
			case 1:
				System.out.println("Enter Employee Id");
				id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name ");
				name=sc.nextLine();
				System.out.println("Enter Designation");
				des=sc.nextLine();
				
				break;
			
			case 2:
				
				System.out.println(" Employee Id "+ id  );
				System.out.println(" Name " + name);
				System.out.println(" Designation " + des);
				
				
				break;
			default:f=0;
				System.out.println("Invalid Entry ");
				
		}	
	
	}
	}


}