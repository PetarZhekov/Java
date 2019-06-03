import java.util.Scanner;
public class GodzillavsKong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		double budget = Double.parseDouble(scan.nextLine());
		int statisti = Integer.parseInt(scan.nextLine());
		double clothesPerOne = Double.parseDouble(scan.nextLine());
		
		double sumDec = budget * 0.10;
		double sumClothes = statisti * clothesPerOne;
		if(statisti > 150) {
			sumClothes = sumClothes - (sumClothes * 0.10); 
		}
		double sumMovie = sumDec + sumClothes;
		
		double diff = Math.abs(budget - sumMovie);
		if(sumMovie > budget) {
		
			System.out.println("Not enough money!");
			System.out.printf("Wingard needs %.2f leva more." , diff);
			
		}
		else {
			
			System.out.println("Action!");
			System.out.printf("Wingard starts filming with %.2f leva left." , diff);
		}

	}

}
