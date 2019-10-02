class Salary3b{
	public static void main(String x[]){
		Taxtime AC = new Taxtime();
		String Name;
		int Salary;
		float Tax, Net;
		Name = "James";
		Salary = 1000;
		Net = Salary -AC.tax(Salary);
		System.out.println("Name: "+Name);
		System.out.println("Salary: "+Salary);
		System.out.println("Net: "+Net);
	}
}