package stringsProblems;

public class RemoveAllWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeSpace("H e l l o"));

	}
	
	private static String removeSpace(String s) {
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

}
