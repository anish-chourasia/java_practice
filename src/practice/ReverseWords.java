package practice;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reverseWords = "";
		String str = "aa BAIL mujhe MAAR";
		
//		convert string to array of strings after splitting each word
		
		String[] arr = str.split(" ");
		
		for (int i = arr.length - 1 ; i>=0 ; i--) {
				reverseWords = reverseWords + arr[i]+ " ";
		}
		
		System.out.println(reverseWords);
	}

}
