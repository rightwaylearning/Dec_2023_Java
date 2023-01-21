package student_info_package;

public class Student {
	
	public int rollNumber;
	public String studentName;
	public Address adr;
	
	public void studentInfo() {
		
		System.out.println(rollNumber);
		System.out.println(studentName);
		
	}
	
	public void studentAddress() {
		
		System.out.println(adr.line1);
		System.out.println(adr.line2);
		System.out.println(adr.pinCode);
	}
	

}
