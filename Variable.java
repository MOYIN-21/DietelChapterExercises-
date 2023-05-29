import java.util.Scanner;
public class Variable{
public static void main(String[] args){
Scanner operator = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int number1 = operator.nextInt();
		
		System.out.print("Enter second number: ");
		int number2 = operator.nextInt();
		
		System.out.print("Enter third number: ");
		int number3 = operator.nextInt();
		
		System.out.print("Enter fourth number: ");
		int number4 = operator.nextInt();
		
		System.out.print("Enter fifth number: ");
		int number5 = operator.nextInt();
		
		int remainder = number1 % number5;
		System.out.printf("Remainder is %d%n", remainder);
	
	    if (number5 % 2 == 0){
		}
		System.out.println("Number 5 is not an even number");
		if (number5 % 2 != 0){
		}
		System.out.println("Number 5 is an even number");
		
		int greater = number5;
		if (number1 < number5){
		greater = number5;
		}
		System.out.println("print greater is" + greater);
		
		int less = number5;
		if (number5 > number1){
		less = number1;
		}
		System.out.printf("less is %d%n", less);
	
}


}