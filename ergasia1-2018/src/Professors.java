
public class Professors extends Users{

	private int professorAFM,salary;
	private Courses course;
	
	public Professors(String username, String name, String surname, String dept,int AFM , int salary) {
		super(username, name, surname, dept);
		setProfessorAFM(AFM);
		setSalary(salary);
		System.out.println("New Professor created!");
	}
	

	public int getProfessorAFM() {
		return professorAFM;
	}

	public void setProfessorAFM(int professorAFM) {
		this.professorAFM = professorAFM;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}
	
	public String getProfessorInfo(){
		return getUserInfo()+" "+getProfessorAFM()+" "+getSalary();
	}

}
