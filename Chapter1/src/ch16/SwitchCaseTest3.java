package ch16;

import java.util.Scanner;

public class SwitchCaseTest3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int month = in.nextInt();

		int day = switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				System.out.println("한 달은 31일 입니다."); // 람다식으로 수행
				yield 31; // day로 반환시켜준다.
			}
			case 4, 6, 9, 11 -> {
				System.out.println("한 달은 30일 입니다.");
				yield 30;
			}
			case 2 -> {
				System.out.println("한 달은 28일 입니다.");
				yield 28;
			}
			default -> {
				System.out.println("존재하지 않는 달입니다.");
				yield -1;
			}
		};

		System.out.println(month + "월은 " + day + "일 입니다.");
	}
}
