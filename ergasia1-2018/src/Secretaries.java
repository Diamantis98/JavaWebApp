import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;


public class Secretaries extends Users{
	private final int secretaryID;
	public Secretaries(String username, String name, String surname, String dept,int ID) {
		super(username, name, surname, dept);
		secretaryID =ID;
		System.out.println("New Secretary created!");
	}
	public int getSecretaryID() {
		return secretaryID;
	}

	public String getSecretaryInfo(){
		return getUserInfo() +" "+getSecretaryID();
	}
	
	
	public static void ReadStudents(int i) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/input.txt")); 
			String line,x [];
			while ((line = br.readLine()) != null) {
				x=line.split(",");
				String username = x[0];
				String name = x[1];
				String surname = x[2];
				String dept = x[3];
				int regnum = Integer.parseInt(x[4]);
				i+=1;
				Students.s.add(i,new Students(username,name,surname,dept,regnum));
			}
			br.close();
		    	
		}
		catch(IOException e){
			System.out.println("File Not Found.");
		}
		catch(InputMismatchException e){
			System.out.println("Wrong file input.");
		}
		catch(Exception e){
			System.out.println("Error ocured during reading file.");
		}    
	}
}