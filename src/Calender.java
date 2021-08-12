import java.util.Scanner;

public class Calender {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalender() {
		System.out.println("일  월  화  수  목  금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		System.out.println("알고 싶은 달을 입력하세요.: ");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		Calender cal = new Calender();

		System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));

		cal.printSampleCalender();
		scan.close();

//		if(inputValue == 1 || inputValue == 3|| inputValue == 5 || inputValue == 7 || inputValue == 8|| inputValue == 10 || inputValue == 12) {
//			System.out.println(31);
//		}else if(inputValue == 2) {
//			System.out.println(28);
//		}else {
//			System.out.println(30);
//		}
	}

}
