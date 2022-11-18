package question2;

public class VowelConsonent {

	void checkVowelConsonent (char i) {
		if (i >= 'a' && i <= 'z' || i >= 'A' && i <= 'Z') {
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U'){
				System.out.println(i + " is Vowel");
			}
			else {
				System.out.println(i + " is Consonent");
			}
		}
		else {
			System.out.println("Invalid character");
		}
	}
	
	public static void main(String[] args) {
		VowelConsonent obj = new VowelConsonent();
		obj.checkVowelConsonent('e');
		obj.checkVowelConsonent('L');
		obj.checkVowelConsonent('&');
	}

}
