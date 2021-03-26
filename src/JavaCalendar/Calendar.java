package JavaCalendar;

import java.util.Scanner;

public class Calendar {

	public static void main (String[] args) {
//		System.out.println(" 일 월  화 수  목  금 토");
//		System.out.println("----------------------");
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9  10 11 12 13 14");
//		System.out.println(" 15 16 17 18 19 20 21");
//		System.out.println(" 22 23 24 25 26 27 28");
		
		System.out.println("달을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int monthNum = scanner.nextInt();
		scanner.close();
		
		if(monthNum == 2) {
			System.out.println("2월은 28일까지 있습니다");
		}
		else if (monthNum == 8) {
			System.out.println("8월은 31일까지 있습니다");
		}
		else if(monthNum % 2 == 0) {//짝수 달이면 30일,2월,8월제외
			System.out.println(monthNum + "월은 30일 까지 있습니다");
		}
		else if (monthNum % 2== 1) {//홀수 달이면 31일
			System.out.println(monthNum + "월은 31일 까지 있습니다");
		}
		else if(monthNum < 1 || monthNum >12){//1~12 월만 입력가능하게
			System.out.println("1년은 1월부터 12월까지 있습니다");
		}
		
	}
}
