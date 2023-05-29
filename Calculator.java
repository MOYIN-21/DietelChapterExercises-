import java.util.Scanner;
public class Calculator{
	public static void main(String[] args) {
	Scanner bottle = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int integer1= bottle.nextInt();

		System.out.print("Enter second integer: ");
		int integer2 = bottle.nextInt();

		System.out.print("Enter third integer: ");
		int integer3 = bottle.nextInt();

		System.out.print("Enter fourth integer: ");
		int integer4 = bottle.nextInt();
		
		System.out.print("Enter fifth integer: ");
		int integer5 = bottle.nextInt();

int sum = integer1 + integer5;
int square = integer3 * integer3;

System.out.printf("%d%n%d%n%", sum, square);

}

}
