package cal_project_opt;

public class Client {
	
	public static void main(String[] args) {
		
		Cal c = new Cal();
		c.a=100;
		c.b=200;
		
		int r = c.sum();
			
		System.out.println(r);
	}

}
