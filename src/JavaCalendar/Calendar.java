package JavaCalendar;

import java.util.Scanner;

public class Calendar {
	private final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int maxDaysOfMonth (int month) {
		return MAX_DAYS[month-1];
		
	}
		
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		while(true) {
			System.out.println("월을 입력하세요");
			month = scanner.nextInt();
			if(month == -1) break;
			if(month > 12) {
				System.out.println("1년은 12월까지 있습니다");
				continue;
			}
			System.out.println(month+"월은"+cal.maxDaysOfMonth(month)+"일까지 있습니다");
		}
		System.out.println("Bye");
		scanner.close();
	}
}
