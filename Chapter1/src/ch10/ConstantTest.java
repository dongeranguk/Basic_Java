package ch10;

// 상수는 변하지 않는 수
// final 예약어를 사용하여 선언
public class ConstantTest {
	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
//		MAX_NUM = 1000;
	}

}
