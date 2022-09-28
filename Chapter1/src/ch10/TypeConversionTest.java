package ch10;

public class TypeConversionTest {
	public static void main(String[] args) {
		byte b_num = 10;
		int i_num = b_num;
		
		int i_num2 = 65;
		char c_num = (char)i_num2;
		
		System.out.println(i_num);
		System.out.println(c_num);
		
		double d_num = 3.14;
		int i_num3 = (int)d_num;
		
		System.out.println(i_num3);
		
		double d_num2 = 1.2;
		float f_num = 0.9F;
		
		int result = (int)d_num2 + (int)f_num; // 1.2와 0.9가 먼저 int형으로 형 변환되어 연산 되므로 1 + 0
		int result2 = (int)(d_num2 + f_num); // 1.2 + 0.9 => 2.1 int형으로 형 변환하면 2
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(5/3);
		System.out.println(5%3);
	}
	
}
