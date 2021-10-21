class Main{
	public static void main(String args[]){
		Student firstboy = new Student();
		firstboy.rollNumber = 1;
		System.out.println(firstboy.rollNumber);
		
		
		Teacher soforAli = new Teacher();
		soforAli.sub = "Math";
		System.out.println(soforAli.sub);
		
		Profession doctor = new Profession();
		doctor.dept = "Surgery";
		System.out.println(doctor.dept);
		
		Person hasnat = new Person();
		hasnat.firstName = "Hasnat";
		hasnat.lastName = "Osman";
		hasnat.phoneNumber = 01776005263;
		hasnat.idNumber = 9;
		hasnat.email = "has@gmail.com";
		hasnat.address = "Chatkhil, Noakhali";
		
		System.out.println(hasnat.firstName);
		System.out.println(hasnat.lastName);
		System.out.println(hasnat.phoneNumber);
		System.out.println(hasnat.idNumber);
		System.out.println(hasnat.email);
		System.out.println(hasnat.address);
		System.out.println("Good Bye!");
		
	}
}