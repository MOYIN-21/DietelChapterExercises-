import java.util.Scanner;
public class Display{
	public static void main(String[] args){
	Scanner mouse = new Scanner(System.in);
	
int x = 5;
int y = 1;
 
 System.out.printf("x = %d%n", x + 5);
 System.out.printf("value of %d is %d/n", x, y, (x * y) );
 //System.out.printf("% is %d and y is %d", x, y);
 System.out.printf("%d is not equal to %d\n", (x + y), (x * y) );
		
	}
}
