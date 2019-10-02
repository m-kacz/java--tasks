class School3{
	private int phy,che,mat;
	private int invalid, noPhy, noChe, noMat;
	private float total, per;
	public void physics(int A){
		if(A>=0 & A<=150){
			phy = A;
			if(A<60){
				noPhy = 1;
			}
		}
		else{
			System.out.println("Invalid Physics marks.");
			invalid = 1;
		}
	}
	public void chemistry(int A){
		if(A>=0 & A<=150){
			che = A;
			if(A<60){
				noChe = 1;
			}
		}
		else{
			System.out.println("Invalid Chemistry marks.");
			invalid = 1;
			noChe =1;
		}
	}
	public void maths(int A){
		if(A>=0 & A<=150){
			mat = A;
			if(A<60){
				noMat = 1;
			}
		}
		else{
			System.out.println("Invalid Maths marks.");
			invalid = 1;
			noMat = 1;
		}
	}
	public void showResults(){
		if(invalid==0){
			total = phy+che+mat;
			per = total*100/450;
			System.out.println("Total Marks: "+total);
			System.out.println("Percentage: "+per);
			if(noPhy+noChe+noMat==0){
				System.out.println("Congratulations, you've passed all your exams!");
			}
			if(noPhy+noChe+noMat==1){
				System.out.print("You have failed one exam, ");
				if(noPhy==1){
					System.out.println("Retake your Physics exam.");
				}
				if(noChe==1){
					System.out.println("Retake your Chemistry exam.");
				}
				if(noMat==1){
					System.out.println("Retake your Maths exam.");
				}
			}
			if(noPhy+noChe+noMat==2){
				System.out.println("You have failed two exams, retake the course.");
			}
			if(noPhy+noChe+noMat==3){
				System.out.println("You have failed all of your exams, GO HOME.");
			}
		}
		else{
			System.out.println("Cannot calculate results.");
		}
	}
}