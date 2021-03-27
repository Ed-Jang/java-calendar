package JavaCalendar;

import java.util.Scanner;

public class Calendar {
	private final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int maxDaysOfMonth (int month) {
		return MAX_DAYS[month-1];
		
	}
		
	public static void main (String[] args) {
		System.out.println("반복 횟수를 입력하세요");
		Scanner scanner = new Scanner(System.in);

		int repeat = scanner.nextInt(); 
		Calendar cal = new Calendar();

		for(int i = 0; i<repeat; i++) {
			System.out.println("월을 입력하세요");
			int month = scanner.nextInt();
			System.out.println(month+"월은"+cal.maxDaysOfMonth(month)+"일까지 있습니다");
		}
		
		scanner.close();
	}
}
