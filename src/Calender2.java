//import java.util.Scanner;
//
//public class Calender2 {
//
//	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//	
//	public int getMaxDaysOfMonth(int month) {
//		return MAX_DAYS[month - 1];
//	}
//
//	public void printSampleCalender() {
//		System.out.println("일  월  화  수  목  금 토");
//		System.out.println("--------------------");
//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
//	}
//	
//	public static void main(String[] args) {
//		
//		System.out.println("반복횟수를 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		int repeat = scan.nextInt();
//		Calender cal = new Calender();
//		
//		for (int i= 0; i < repeat; i++) {
//			System.out.println("달을 입력하세요.");
//			int month = scan.nextInt();
//			if(month <=0) {
//				System.out.println("Have a nice day!");
//			}else {
//			//	System.out.printf("%d달은 %d입니다.\n", month, cal.getMaxDaysOfMonth(month));
//			}
//		}
//		System.out.println("Bye~");
//		scan.close();
//	}
//
//}
