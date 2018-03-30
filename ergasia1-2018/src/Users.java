import java.util.InputMismatchException;
import java.util.Scanner;

public class Users {

	/**
	 * @param args
	 */
	private String username,name,surname,department;
	private static int counter=0;
	private Scanner input;
	
	public Users (String username,String name,String surname,String dept){
		this.username =username;
		this.name =name;
		this.surname=surname;
		this.department=dept;
		counter+=1;
		System.out.println("New User created!");
	}
	//Alternative Constructor
	public Users (){
		System.out.println("Username :");
		this.username = setString();
		
		System.out.println("Name :");
		this.name = setString();
		
		System.out.println("Surname :");
		this.surname = setString();
		
		System.out.println("Department :");
		this.department = setString();	
		counter +=1;
	}
	
	//reading Users attributes from console.
	public String setString(){
		input = new Scanner(System.in);	
		try{
			return input.nextLine();
		}
		catch(InputMismatchException e) {
			
			System.out.println("Input Exception! Try again!");
			return setString();
		}
	}
	
	//Getters
	public String getUsername(){
		return username;
	}
	public String getName(){
		return name;
	}
	public String getSurname(){
		return surname;
	}
	public String getDepartment(){
		return department;
	}
	public static int getCounter(){
		return counter;
	}
	
	//Setters
	public void setUsername(String set){
		this.username =set;
	}
	public void setName(String set){
		this.name =set;
	}
	public void setSurname(String set){
		this.surname =set;
	}
	public void setDepartment(String set){
		this.department =set;
	}
	
	// Return User informations
	public String getUserInfo(){
		return getName()+" "+ getSurname()+" "+getDepartment();
	}
}
