import java.util.Scanner;
public class Journey {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double budget = Double.parseDouble(scan.nextLine());
		String season = scan.nextLine();
		
		double price = 0;
		String place = null;
		String camporhotel = null ;
		switch(season) {
		 case "summer":
			 if(budget <= 100) {
			 place = "Bulgaria";
			 price = 0.3 * budget;
			 camporhotel = "Camp";
			 }
			 else if( budget <= 1000) {
				 place = "Balkans";
				 price = 0.4 * budget;
				 camporhotel = "Camp";
			 }
			 else if(budget > 1000) {
					
					place = "Europe";
					price = 0.9 * budget;
					camporhotel = "Hotel";
					
				}
             break;
		 case "winter":
			 if(budget <= 100) {
				 place = "Bulgaria";
				 price = 0.7 * budget;
				 camporhotel = "Hotel"; 
			 }
				 else if(budget <= 1000) {
					 place = "Balkans";
					 price = 0.8 * budget;
						camporhotel = "Hotel";
				 }
				 else if(budget > 1000) {
						
						place = "Europe";
						price = 0.9 * budget;
						camporhotel = "Hotel";
			 }
			 break;
		}
		
	
		 System.out.printf("Somewhere in %s%n", place);
		 System.out.printf("%s - %.2f", camporhotel , price);

	}

}
