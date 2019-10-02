class salary{
	public static void main(String abc[]){
		int salary = 2000;
		float tax = 0;
		float net;
		String name = "Peter";

		if(salary >= 2000)tax=((salary*21)/100);
		if(salary < 2000)tax=((salary*15)/100);
		net = salary-tax;
		System.out.println("Name:"+name);
		System.out.println("Tax:"+tax);
		System.out.println("Net Salary:"+net);
	}
}