import java.util.Scanner;
public class IT24103583Lab4Q2 {
public static void main(String[]args) {

Scanner scanner = new Scanner(System.in);
System.out.print("Please enter exam marks (out of 100):");
	double examMarks=scanner.nextDouble();
if (examMarks>100){
	System.out.println("Invaild input for exam marks. Terminating program.");
return;
}
System.out.print("Please enter lab submission marks (out of 100):");
	double labMarks=scanner.nextDouble();
if (labMarks>100){
	System.out.println("Invaild input for lab submission marks. Terminating program.");
return;
}
System.out.print("Please enter the percentage given for the exam:");
	double examPer=scanner.nextDouble();

System.out.print("Please enter the percentage given for the lab submission:");
	double labPer=scanner.nextDouble();
if (labPer+examPer !=100){
	System.out.println("The persentages must add up to 100. Terminating program");
return;
} 
double finalmarks= (examMarks*examPer/100)+(labMarks*labPer/100) ;
System.out.println("Final exam marks is:"+ finalmarks);
}
}
