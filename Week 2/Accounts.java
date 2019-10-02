class Accounts{
	public static void main(String X[]){
		Taxmain AC = new Taxmain();
		AC.Tax();
		AC.Tax(2000);
		AC.Tax(3000,15);
	}
}

class Taxmain{
	public void Tax(){
		System.out.println("Tax Rate:"+21);
	}
	public void Tax(int Salary){
		float T = (float)Salary*21/100;
		System.out.println("Your Tax is: "+T);
	}
	public void Tax(int Salary, int Rate){
		float T = (float)Salary*Rate/100;
		System.out.println("Your Tax is: "+T);
	}	
}