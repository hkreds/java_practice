package week.problem3;

public class Problem3_9 {
	public static void main(String[] args) {
		int n = (int) (Math.random()*100)+1;
		System.out.println(n);
		if(n<50) {
			System.out.println("50未満です");
		}else {
			System.out.println("50以上です");
		}
	}
}
