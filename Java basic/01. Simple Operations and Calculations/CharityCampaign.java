import java.util.Scanner;
public class CharityCampaign {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int days = Integer.parseInt(scan.nextLine());
		int backers = Integer.parseInt(scan.nextLine());
		int cakes = Integer.parseInt(scan.nextLine());
		int waffles = Integer.parseInt(scan.nextLine());
		int pancakes = Integer.parseInt(scan.nextLine());
		
		double cakesProfit = cakes * 45;
		double wafflesProfit = waffles * 5.80;
		double pancakesProfit = pancakes * 3.20;
		
		double profitPerDayByOne = cakesProfit + wafflesProfit + pancakesProfit;
		double profitPerDayByAll = profitPerDayByOne * backers;
		
		double totalProfit = profitPerDayByAll * days;
		double expanses = totalProfit / 8;
		
		double finalProfit = totalProfit - expanses;
		
		System.out.printf("%.2f", finalProfit);
		
		

	}

}
