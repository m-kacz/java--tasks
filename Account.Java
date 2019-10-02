class Account{
	public void taxCalculation(int Salary){
		float tax;
		tax = salary*21/100;
		System.out.println("You're tax is :" +tax);
	}
	public float tax(int salary){
		float t = salary*21/100;
		return t;
	}
}