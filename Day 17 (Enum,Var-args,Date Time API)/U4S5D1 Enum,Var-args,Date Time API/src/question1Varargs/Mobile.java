package question1Varargs;

import java.util.Arrays;

public class Mobile {
	
	static String[] outdatedModels = {"note4","note5","note6","note7"};
	
	static void searchOutdatedModel(String... models ){
		for (String s : models) {
			if (Arrays.asList(outdatedModels).contains(s)) {
				System.out.println(s + "_OUTDATED");
			}
		}
	}
	public static void main(String[] args) {
		searchOutdatedModel("note4", "note9"); 
	}

}
