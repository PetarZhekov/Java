import java.util.Scanner;
public class OperationsBetweenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = Integer.parseInt(scan.nextLine());
		int n2 = Integer.parseInt(scan.nextLine());
		String operation = scan.nextLine();
		
		int sum=0;
		String evenOrodd=null;
		
		switch(operation) {
		case"+":
			sum=n1+n2;
			if((sum%2)==0)
				   evenOrodd = "even";
				else
				   evenOrodd = "odd";
			System.out.printf("%d + %d = %d - %s",n1,n2, sum , evenOrodd);
			break;
		case"-":
			sum=n1-n2;
			if((sum%2)==0)
				   evenOrodd = "even";
				else
				   evenOrodd = "odd";
			System.out.printf("%d - %d = %d - %s",n1,n2, sum , evenOrodd);
			break;
		case"*":
			sum=n1*n2;
			if((sum%2)==0)
				   evenOrodd = "even";
				else
				   evenOrodd = "odd";
			System.out.printf("%d * %d = %d - %s",n1,n2, sum , evenOrodd);
			break;
		case"/":
			double sum1 = 0.0;
			if(n2 == 0) {
				System.out.printf("Cannot divide %d by zero", n1);
				break;
			}
			else
			
			sum1=(((double)n1/(double)n2));
		
			System.out.printf("%d / %d = %.2f",n1,n2, sum1);
			break;
		case"%":
			if(n2 == 0) {
				System.out.printf("Cannot divide %d by zero", n1);
				break;
			}
			else
			sum=n1 % n2;
			System.out.printf("%d %s %d = %d",n1,operation,n2, sum);
			break;
		}

	}

}
