import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double fnum, snum, answer;
		String operator;
		
		System.out.println("Enter first num: ");
		fnum = scanner.nextDouble();
		
		System.out.println("Enter operator");
		operator = scanner.nextLine();
		
		System.out.println("Enter second num: ");
		snum = scanner.nextDouble();
		
		answer = fnum + snum;
		System.out.println(answer);
	}

}
