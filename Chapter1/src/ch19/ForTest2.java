package ch19;

public class ForTest2 {
	public static void main(String[] args) {
		
		int i=0;
		// 이미 이전에 초기화 했을 경우 생략 가능
		for( ; i<5; i++) {

		}
		
		int sum = 0;
		// 수행문 내부에서 조건을 검사할 경우 생략 가능
		for(int j=0; ; j++) {
			sum += j;
			if(sum < 200) break;
		}
		
		// 증감식에 대한 연산이 복잡한 경우 수행문 내부에 작성하여 생략 가능
		for(int j=0; j<5; ) {
			j = (++j) % 10;
		}
		
		//무한 반복
		for( ; ; ) {
			
		}
		
		
	}
}
