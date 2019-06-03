import java.util.Scanner;
public class AlcoholMarket {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double WhiskeyBGN = Double.parseDouble(scan.nextLine());
		double BeerL = Double.parseDouble(scan.nextLine());
		double WineL = Double.parseDouble(scan.nextLine());
		double RakiqL = Double.parseDouble(scan.nextLine());
		double WhiskeyL = Double.parseDouble(scan.nextLine());
		
		double priceRakiqforL = WhiskeyBGN / 2;
		double priceWineforL = priceRakiqforL - (0.4 * priceRakiqforL);
		double priceBeerforL = priceRakiqforL - (0.8 * priceRakiqforL);
		
		double sumRakiq = priceRakiqforL * RakiqL;
		double sumWine = priceWineforL * WineL;
		double sumBeer = priceBeerforL * BeerL;
		double sumWhiskey = WhiskeyL * WhiskeyBGN;
		
		double totalSum = sumRakiq + sumWine + sumBeer + sumWhiskey;
		
		System.out.printf("%.2f", totalSum);

	}

}
