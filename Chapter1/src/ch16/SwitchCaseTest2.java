package ch16;

import java.util.Scanner;

public class SwitchCaseTest2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String medal = in.nextLine();
		
		switch(medal) {
			case "Gold" : case "gold" :
				System.out.println("�ݸ޴� �Դϴ�.");
				break;
			case "Silver" : case "silver" :
				System.out.println("���޴� �Դϴ�.");
				break;
			case "Bronze" : case "bronze" :
				System.out.println("���޴� �Դϴ�.");
				break;
			default :
				System.out.println("�޴��� �����ϴ�.");
		}
	}
}
