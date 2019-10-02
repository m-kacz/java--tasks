class salary2{
	public static void main(String abc[]){
		String name = "Peter";
		int salary = 2100;
		float tax = 0;
		float net = 0;

		if(salary>1500){
			tax = (salary*21)/100;
			net = salary - tax;
			System.out.println("Salary: \u00A3"+salary);
			System.out.println("Tax: \u00A3"+tax);
			System.out.println("Net: \u00A3"+net);
		}
		else{
			System.out.println("No Tax");
		}


	}
}