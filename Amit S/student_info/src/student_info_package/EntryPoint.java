package student_info_package;

public class EntryPoint {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.rollNumber=23;
		s.studentName="Amit";
		
		
				Address a= new Address();
				a.line1="Wagholi";
				a.line2="Pune";
				a.pinCode=412207;
				
			s.adr=a;
			
			s.studentInfo();
			s.studentAddress();
		
		
	}

}
