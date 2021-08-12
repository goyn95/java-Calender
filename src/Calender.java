import java.util.Scanner;

public class Calender {
	public static void main(String[] args) {
		System.out.println("일  월  화  수  목  금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		System.out.println("알고 싶은 달을 입력하세요.: ");
		Scanner scan = new Scanner(System.in);
		int inputValue = scan.nextInt();
		
		if(inputValue == 1 || inputValue == 3|| inputValue == 5 || inputValue == 7 || inputValue == 8|| inputValue == 10 || inputValue == 12) {
			System.out.println(31);
		}else if(inputValue == 2) {
			System.out.println(28);
		}else {
			System.out.println(30);
		}
	}

}
