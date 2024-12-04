package section08;
// 8-16
public class MidTerm {
	public int score(int[] scores) {
		int result = 0;
		for(int i = 0; i < scores.length; i++) {
			result += scores[i];
		}
		
		return result;
		
	}
}
