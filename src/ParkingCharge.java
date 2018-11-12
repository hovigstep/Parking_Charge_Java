import java.util.Scanner;

public class ParkingCharge {
	public static void main(String[] args) 
    {
        
        double C1hour;
        double C2hour;
        double C3hour;
        
        double minchar = 2;
		double addchar = 0.50;
		int maxchar = 10;
        
        Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter First Customer Time:");
		C1hour= input.nextInt();
		
		System.out.print("Enter Second Customer Time");
		C2hour= input.nextInt();
		
		System.out.print("Enter third Customer Time");
		C3hour= input.nextInt();
		
		
			if (C1hour <= 3)
			{
				System.out.printf("%f\n", minchar);
			}
			else if (C1hour >= 3)
			{
				minchar = minchar + (addchar*C1hour);
				System.out.printf("%f\n", minchar);
			}
			else {
			System.out.printf("%f\n", maxchar);
			
			}
			
			if (C2hour <= 3)
			{
				System.out.printf("%f\n", minchar);
			}
			else if (C2hour >= 3)
			{
				minchar = minchar + (addchar*C2hour);
				System.out.printf("%f\n", minchar);
			}
			else {
			System.out.printf("%f\n", maxchar);
			
			}
			
			if (C3hour <= 3)
			{
				System.out.printf("%f\n", minchar);
			}
			else if (C3hour >= 3)
			{
				minchar = minchar + (addchar*C3hour);
				System.out.printf("%f\n", minchar);
			}
			else {
			System.out.printf("%f\n", maxchar);
			
			}
			
			
			
		}
		
}
