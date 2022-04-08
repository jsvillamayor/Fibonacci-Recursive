import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which iteration of Fibonacci sequence?");
		int iterations = scanner.nextInt();
		System.out.println(fibonacci(iterations));

	}
	
	private static int fibonacci(int iterations) {
		
		if(iterations<=1)
			return iterations;
		else
			return fibonacci(iterations-2) + fibonacci(iterations-1);
		
	}

}
