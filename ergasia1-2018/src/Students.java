import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Students extends Users{
	//list of students
    static 	List<Students> s = new ArrayList<Students>();
	
	private final int registrationNumber;
	private Scanner read;
	
	public Students(String username, String name, String surname, String dept, int regNum) {
		super(username, name, surname, dept);
		registrationNumber=regNum;
		System.out.println("New Student created!" );
	}
	//Alternative constructor for Students
	public Students(){
		super() ;
		System.out.println("Students Registration Number (integer):");
		registrationNumber = getValue();
		System.out.println("New Student created!" );
	}
	//Reading-Checking Students registration number.
	private int getValue(){
		read = new Scanner(System.in);

		try{
			return read.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Wrong input try again.");
			return getValue();
		}
	}
	

	public int getRegistrationNumber() {
		return registrationNumber;
	}
	
	public String getStudentInfo(){
		return getUserInfo()+" "+getRegistrationNumber() ;
	}	

}
