package ch20;

public class NestedLoopTest {
	public static void main(String[] args) {
		/*
		 * 중첩 반복문을 사용할 떄에는 외부 제어와 내부 제어를 눈여겨 봐야한다.
		 * 언제 초기화를 진행해야 하는지, 조건은 어디서 검사해야 하는지
		 */
		int dan = 2;
		int count = 1;
		
		for( ; dan <= 9; dan++) {
			for(count=1; count <= 9; count++) {
				System.out.println(dan +  " * " + count + " = " + dan * count);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------");
		
		dan = 2;
		while(dan <= 9)	{ 
			count = 1; // 내부 중첩 while문에서 count를 증가시켰기 떄문에 초기화 필요
			while(count <= 9) {
				System.out.println(dan + " * " + count + " = " + dan * count);
				count++;
			}
			dan++;
			System.out.println();
		}
	}
}
