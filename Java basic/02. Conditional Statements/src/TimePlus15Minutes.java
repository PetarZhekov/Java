import java.util.Scanner;
public class TimePlus15Minutes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int startHour = Integer.parseInt(scan.nextLine());
		int startMinutes = Integer.parseInt(scan.nextLine());
		
		int timeInMinutes = startHour * 60 + startMinutes;
		
		int timePlus15 = timeInMinutes + 15;
		
		int finalHour = timePlus15 / 60;
		int finalMinutes = timePlus15 % 60;
		
		if(finalHour >= 24) {
			finalHour -=24;
		}
		
		if(finalMinutes < 10) {
			System.out.printf("%d:0%d", finalHour , finalMinutes);
			
		}
		else {
			System.out.printf("%d:%d", finalHour , finalMinutes);
		}
		
		
	}

}