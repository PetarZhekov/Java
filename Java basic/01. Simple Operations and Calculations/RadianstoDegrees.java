import java.util.Scanner;
public class RadianstoDegrees {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double Radians = Double.parseDouble(scan.nextLine());
		double Degrees = Radians * 180 / Math.PI;
		System.out.printf("%.0f", Degrees);
	}

}
