import java.util.Scanner;
public class MetricConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double value = Double.parseDouble(scan.nextLine());
		String inputMetric = scan.nextLine();
		String outputMetric = scan.nextLine();
		
		if(inputMetric.equals("mm")) {
			value /= 1000;
		}
		else if(inputMetric.equals("cm")) {
			value /=100;
		}
		
		if(outputMetric.equals("mm")) {
			value *=1000;
		}
		else if(outputMetric.equals("cm")) {
			value *=100;
		}
		
		System.out.printf("%.3f", value);

	}

}