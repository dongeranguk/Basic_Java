package ch17;

public class WhileTest {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0; // sum은 지역변수이므로 자동으로 초기화되지 않으므로 초기화
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}
}
