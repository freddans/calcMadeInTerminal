import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		System.out.println("First argument = 1, addition");
		System.out.println("First argument = 2, subtraction");
		System.out.println("First argument = 3, multiplication");
		System.out.println("First argument = 4, divide");

		if (args.length != 3) {
			System.out.println("Please send 3 inputs");
		} else {

			if (args[0].equals("1")) {
				System.out.println(calculator.addition(Double.parseDouble(args[1]), Double.parseDouble(args[2])));
			} else if (args[0].equals("2")) {
				System.out.println(calculator.subtract(Double.parseDouble(args[1]), Double.parseDouble(args[2])));
			} else if (args[0].equals("3")) {
				System.out.println(calculator.multiply(Double.parseDouble(args[1]), Double.parseDouble(args[2])));
			} else if (args[0].equals("4")) {
				System.out.println(calculator.divide(Double.parseDouble(args[1]), Double.parseDouble(args[2])));
			}
		}
	}
}
