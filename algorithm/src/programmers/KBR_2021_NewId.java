package programmers;

public class KBR_2021_NewId {

	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		solution(new_id);
	}
	
	private static String solution(String new_id) {
		String answer = "";
        answer = new_id;
        
        if (answer==""||answer.equals(null)) {
        	answer = "a";
        } else {
        	answer = new_id.toLowerCase().replaceAll("[^a-z0-9-_.]*", "").replaceAll("\\.{2,}", ".").replaceAll("^[.]|[.]$", "");
        }
        if(answer.length() > 15) {
    		answer = answer.substring(0, 15).replaceAll("[.]$", "");
    	}
        if(answer.length() <= 2) {
        	if (answer.length() == 0) {
        		answer = "a";
        	}
        	while (true){
        		answer += answer.substring(answer.length()-1, answer.length());
        		if(answer.length()==3) {
        			break;
        		}
        	}
        }
		return answer;
	}
}