import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal>";

	public void runPrompt() {
		String PROMPT = "cal>";
		Scanner scan = new Scanner(System.in);
		Calender cal = new Calender();

		int month = 1;
		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = scan.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printCalender(2017, month);
		}
		System.out.println("끝!");
		// cal.printSampleCalender();
		scan.close();
	}

	public static void main(String[] args) {

		// 셀 실현
		Prompt p = new Prompt();
		p.runPrompt();

	}
}
