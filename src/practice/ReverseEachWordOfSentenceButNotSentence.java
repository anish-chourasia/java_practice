package practice;

public class ReverseEachWordOfSentenceButNotSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = "";
		String str = "O bhai maaro Mujhe";
		
		String[] arr = str.split("\\s");
		
		for ( String word:arr )	{
			
			int j = word.length()-1;
			String rev_word = "";
			
			while(j>=0) {
				char ch = word.charAt(j);
				
				rev_word = rev_word + ch;
				j--;
			}
			result = result + rev_word + " ";
		}
		
		System.out.println(result);
	}
	

}
