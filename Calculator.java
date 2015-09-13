import java.util.Scanner;

public class Calculator
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		float number1, number2, sum, subtract, multiply, divide;
		
		System.out.print("Enter first number: ");
		number1 = input.nextFloat();
		System.out.print("Enter second number: ");
		number2 = input.nextFloat();
		
		sum = number1 + number2;
		subtract = number1 - number2;
		multiply = number1 * number2;
		divide = number1 / number2;
		
		System.out.printf("The sum is %f\n", sum);
		System.out.printf("The diffence is %f\n", subtract);
		System.out.printf("The multiplication is %f\n", multiply);
		System.out.printf("The division is %f\n", divide);
	}

}
