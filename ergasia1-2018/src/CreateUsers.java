import java.util.Scanner;

public class CreateUsers {
	/*
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Create User.
		Users user = new Users("user1", "username", "surname", "financials");
		System.out.println(user.getUserInfo());
		//Create Student.
		Students.s.add(0,new Students("user2", "onoma", "epitheto", "informatics", 16131)) ;
		System.out.println(Students.s.get(0).getStudentInfo());
		//Create Professor.
		Professors prof = new Professors("profUser"	, "profname", "profsurname", "informatics", 123456789,3000);
		System.out.println(prof.getProfessorInfo());
		//Create Secretary.
		Secretaries sec = new Secretaries("secUser", "secName", "secSurname", "informatics", 100);
		System.out.println(sec.getSecretaryInfo());
		
		Scanner input= new Scanner(System.in);
		//change Student info.
		System.out.println("Give new name:");
		Students.s.get(0).setName(input.nextLine());
		System.out.println("Give Department");

		Students.s.get(0).setDepartment(input.nextLine());
		System.out.println(Students.s.get(0).getStudentInfo());
		
		//Creating new Student with input info.
		System.out.println("Create a new Student:");
		Students.s.add(1,new Students());
		input.close();
		System.out.println(Students.s.get(1).getStudentInfo());
		
		Secretaries.ReadStudents(Students.s.size()-1);
		
		//Print all Students.
		System.out.println("Students:");
		System.out.println("");
		for	(int j = 0 ; j <= Students.s.size()-1;j++){
			System.out.println(Students.s.get(j).getStudentInfo());
			
		}
	}
}
