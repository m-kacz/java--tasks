class Results{
	public static void main(String X[]){
		Exam School = new Exam(400);
		Exam College = new Exam(600);
		School.showResults(500);
		College.showResults(500);
	}
}

class Exam{
	private int TotalMarks;
	public Exam(int Marks){
		TotalMarks = Marks;
	}
	public void showResults(int MarksObt){
		float per = (float)MarksObt*100/TotalMarks;
		System.out.println(per+"%");
		if(per >= 60){
			System.out.println("You have passed the exam");
		}
		else{
			System.out.println("You have failed the exam");
		}
	}
}