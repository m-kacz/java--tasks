class Results3{
	int phy, che, mat;
	private float total, per;
	private void doCalculations(){
		total = phy+che+mat;
		per = total*100/450;
	}
	public void showResults(){
		doCalculations();
		System.out.println("Total Marks: "+total);
		System.out.println("Percentage: "+per);
	}
}