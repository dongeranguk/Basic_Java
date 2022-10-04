package ch19;

public class ForTest {
	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		// 초기화식, 증감식은 1개 이상 사용 가능하며, 구분하기 위해 쉼표(,) 사용
		
//		for(int i=0; i<10; i++, count++) {
//			sum += count;
//		}
//		System.out.println(sum);
	
		int num = 1;
		int total = 0;
		
		while(num <= 10) {
			total += num;
			num++;
		}
		
		System.out.println(total);
		// 둘 다 결과는 같지만, for문이 while문보다 간편하고 가독성 좋다.
	}
}
