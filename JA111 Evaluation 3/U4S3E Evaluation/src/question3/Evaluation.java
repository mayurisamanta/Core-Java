package question3;

public abstract class Evaluation {
	
	
	Evaluation(int i){
		numberOfQuestions = i;
	}
	
	private final int numberOfQuestions;
	
	abstract void evaluationTiming();
	
	void printNoOfQuestions() {
		System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
	}

	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}
	
	
}
