package snippet;

public class stringgroup {
	
	public void piglatin(String word) {
		
		word = word + word.charAt(0) + "ay";
		
		System.out.println(word.substring(1));
	}
	
	public void letters(String word, char letter) {
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter) {
				System.out.println("$");
			}
			else {
				System.out.println(word.charAt(i));
			}
		}
		
	}
	
	public void longest(String[] words) {
		
		String max = "";
		
		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > max.length()) {
				max = words[i];
			}
		}
		
		System.out.println(max);
	}
	
}

