class Account1a{
	public void taxCalculation(int Salary){
		float tax;
		tax = Salary*21/100;
		System.out.println("Your tax is :" +tax);
	}
	public float tax(int Salary){
		float t = Salary*21/100;
		return t;
	}
}