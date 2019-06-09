import java.util.Scanner;
public class HotelRoom {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		String month = scan.nextLine();
		int nights = Integer.parseInt(scan.nextLine());
		
		double priceAp = 0 ;
		double priceSt = 0 ;
		
		double priceAllst = 0;
		double priceAllap = 0 ;
		
		 switch (month) {
         case "May":
             
             
             if(nights > 6 && nights <= 14) {
 		
 				priceSt = 50 - (0.05 * 50);
 				priceAllst = priceSt * nights;
 				
 				priceAp = 65;
 				priceAllap = nights * priceAp;
             }
             else  {
            	priceSt = 50 - (0.3 * 50);
  				priceAllst = priceSt * nights;
  				
  				priceAp = 65 - (0.1 * 65);
  				priceAllap = nights * priceAp;
 				
 				
 			}
             break;
         case "October":
        	 if(nights > 6 && nights <= 14) {
        	 		
  				priceSt = 50 - (0.05 * 50);
  				priceAllst = priceSt * nights;
  				
  				priceAp = 65;
  				priceAllap = nights * priceAp;
              }
              else  {
             	priceSt = 50 - (0.3 * 50);
   				priceAllst = priceSt * nights;
   				
   				priceAp = 65 - (0.1 * 65);
   				priceAllap = nights * priceAp;
  				
  				
  			}
             break;
         case "June":
        	 if(nights > 14) {
        	 		
        		 priceSt = 75.20 - (0.2 * 75.20) ;
    				priceAllst = priceSt * nights;
    				
    				priceAp = 68.70 - (0.1 * 68.70);
    				priceAllap = nights * priceAp;
              }
              else  {
             	
   				
   				priceSt = 75.20 ;
  				priceAllst = priceSt * nights;
  				
  				priceAp = 68.70;
  				priceAllap = nights * priceAp;
  				
  				
  			}
             break;
         case "September":
        	 if(nights > 14) {
     	 		
        		 priceSt = 75.20 - (0.2 * 75.20) ;
    				priceAllst = priceSt * nights;
    				
    				priceAp = 68.70 - (0.1 * 68.70);
    				priceAllap = nights * priceAp;
              }
              else  {
             	
   				
   				priceSt = 75.20 ;
  				priceAllst = priceSt * nights;
  				
  				priceAp = 68.70;
  				priceAllap = nights * priceAp;
   				
   			}
             break;
         case "July":
        	 if(nights <= 14) {
        	 		
  				priceSt = 76;
  				priceAllst = priceSt * nights;
  				
  				priceAp = 77;
  				priceAllap = nights * priceAp;
              }
              else  {
             	priceSt = 76;
   				priceAllst = priceSt * nights;
   				
   				priceAp = 77 - (0.1 * 77);
   				priceAllap = nights * priceAp;
  				
  				
  			}
             break;
         case "August":
        	 if(nights <= 14) {
     	 		
   				priceSt = 76;
   				priceAllst = priceSt * nights;
   				
   				priceAp = 77;
   				priceAllap = nights * priceAp;
               }
               else  {
              	priceSt = 76;
    				priceAllst = priceSt * nights;
    				
    				priceAp = 77 - (0.1 * 77);
    				priceAllap = nights * priceAp;
   				
   				
   			}
             break;
		
		 }
			
			
		
		 System.out.printf("Apartment: %.2f lv.%n", priceAllap);
		 System.out.printf("Studio: %.2f lv.", priceAllst);
		
	}

}
