import java.util.Scanner;
public class IT24103583Lab4Q3 {
public static void main(String[]args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number:");
double num = scanner.nextDouble();
String result= 	(num>0) ? "Positive":
		(num<0) ? "Negative":
		 "Zero";
System.out.println("This number: "+result);
}
}

