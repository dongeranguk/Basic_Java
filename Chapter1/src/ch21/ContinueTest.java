package ch21;

public class ContinueTest {
	public static void main(String[] args) {
		
		int num;
		
		for(num = 1; num <= 100; num++) {
			if((num % 3) != 0) continue; // 조건문을 통과하면 for문으로 리턴
			System.out.println(num);
		}
		
	}
}
