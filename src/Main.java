import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);            //Creat Scanner
		System.out.print("Enter Data: ");
		String data = scanner.nextLine();                    // get Data
		String[] string_data = data.split(" ");        // Convert String into array
		int[] int_data = new int[string_data.length];
		for (int i = 0; i < string_data.length; i++) {
			int_data[i] = Integer.parseInt(string_data[i]);
		}
		int product = 1;
		for (int i = 0; i < int_data.length; i++) {
			product *= int_data[i];
		}
		double g_mean = Math.pow(product, 1.0 / int_data.length);
		System.out.print("The Geometric Mean is: " + g_mean);
	}
}