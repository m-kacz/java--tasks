class School2{
	private int phy,che,mat;
	private float total, per;
	public void physics(int A){
		if(A>=0 & A<=150){
			phy = A;
		}
		else{
			System.out.println("Invalid Physics marks.");
		}
	}
	public void chemistry(int A){
		if(A>=0 & A<=150){
			che = A;
		}
		else{
			System.out.println("Invalid Chemistry marks.");
		}
	}
	public void maths(int A){
		if(A>=0 & A<=150){
			mat = A;
		}
		else{
			System.out.println("Invalid Maths marks.");
		}
	}
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