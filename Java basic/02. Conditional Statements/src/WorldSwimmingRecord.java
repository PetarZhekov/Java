import java.util.Scanner;
public class WorldSwimmingRecord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double Record = Double.parseDouble(scan.nextLine());
		Double Distances = Double.parseDouble(scan.nextLine());
		Double TimeFor1m = Double.parseDouble(scan.nextLine());
		
		Double MustSwuim = Distances * TimeFor1m;
		Double slowTime = Math.floor(Distances / 15) * 12.5;
		
		Double totalTime = MustSwuim + slowTime;
		
	
		if(Record > totalTime ) {
			System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
			
		}
		else {
			double need = totalTime - Record;
			System.out.printf("No, he failed! He was %.2f seconds slower.", need);
		}

	}

}
