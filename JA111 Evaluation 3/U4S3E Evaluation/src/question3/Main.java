package question3;

public class Main {

	static void messageToStudents(Evaluation evaluation) {
		if (evaluation instanceof CodingEvaluation) {
			
			CodingEvaluation e = ((CodingEvaluation) evaluation);
			System.out.println("Its a Coding Evaluation");
			System.out.println("No. of Questions in Evaluation is :" + e.getNumberOfQuestions());
			e.evaluationTiming();
			System.out.println("=========================================================");
		}
		else {
			DsaEvaluation e = ((DsaEvaluation) evaluation);
			System.out.println("Its a DSA Evaluation");
			System.out.println("No. of Questions in Evaluation is :" + e.getNumberOfQuestions());
			e.evaluationTiming();
			System.out.println("=========================================================");
		}
	}
	public static void main(String[] args) {
		
		messageToStudents(new DsaEvaluation(5));
		messageToStudents(new CodingEvaluation(4));
	}
	
}
