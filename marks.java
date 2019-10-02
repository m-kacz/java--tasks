class marks{
	public static void main(String abc[]){
		int phy = 70;
		int che = 80;
		int mat = 90;

		int total = phy + che + mat;
		int per = (total*100)/450;

		if(per>=50){
			System.out.println("Total:"+total);
			System.out.println("Percentage:"+per);
			System.out.println("You have passed the exam");
		}
		else{
			System.out.println("You have failed the exam");
		}


	}
}