import java.util.Scanner;

public class Addition{
	public static void main(String[] args){
	
	Scanner  addition = new Scanner(System.in);

	int number1;
	int number2;
	int sum;

	System.out.print("Enter first integer: ");
	number1 = addition.nextInt();

	System.out.print("Enter second integer: ");
	number2 = addition.nextInt();

	sum = number1+number2;

	System.out.printf("The sum is %d", sum);

//	System.out.printf("The sum is %s%n%s%n", sum);

	}
}	