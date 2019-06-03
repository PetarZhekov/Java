import java.util.Scanner;
public class Cinema {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String projection = scan.nextLine();
		int rows = Integer.parseInt(scan.nextLine());
		int columns = Integer.parseInt(scan.nextLine());
		
		double income = 0;
		
		if("Premiere".contentEquals(projection)) {
			income = rows * columns * 12;
		}
		else if("Normal".contentEquals(projection)) {
			income = rows * columns * 7.50;
		}
		else if("Discount".contentEquals(projection)) {
			income = rows * columns * 5;
			
		}
		System.out.printf("%.2f", income);
	}

}
