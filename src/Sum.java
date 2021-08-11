import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		//입력: 키보드로 두 수의 입력을 받는다.
		//출력 : 두수의 합
		System.out.println("숫자 2개를 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		String inputValue = scan.nextLine();
		String[] splitValue = inputValue.split(",");
		int firstValue = Integer.parseInt(splitValue[0]);
		int secondValue = Integer.parseInt(splitValue[1]);
		
		System.out.println(firstValue + secondValue);
	}

}
