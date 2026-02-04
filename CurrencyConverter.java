import java.util.Scanner;

class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		for (; ; )
		{
			System.out.println("Welcome in Currency Converter: ");
			System.out.println("Enter a Amount ");
			double enterAmount= sc.nextDouble();
			
			System.out.println("Choose the currency to convert:  ");
			System.out.println("1. USD \n 2. EUR  \n 3. YEN  \n 4. KWD  \n 5. AUS DOLLAR  \n 6. CAD  \n 7. YON  \n 8. GBD  \n 9. JPY  \n 10. RAND  \n  ");
			
			String chooseCurr= sc.next().toUpperCase();
			double convertedAmount= 0;
			boolean assume = true;
			
			if (chooseCurr.equals("USD"))
			{ 
				convertedAmount= enterAmount/90.21;
				
			}
			else if (chooseCurr.equals("EUR"))
			{ 
				convertedAmount= enterAmount/107.938;
				
			}
			if (chooseCurr.equals("YEN"))
			{ 
				convertedAmount= enterAmount/0.58779;
				
			}
			if (chooseCurr.equals("KWD"))
			{ 
				convertedAmount= enterAmount/296.797;
				
			}
			if (chooseCurr.equals("AUD"))
			{ 
				convertedAmount= enterAmount/63.3894;
				
			}
			if (chooseCurr.equals("CAD"))
			{ 
				convertedAmount= enterAmount/66.7924;
				
			}
			if (chooseCurr.equals("RENMINBI"))
			{ 
				convertedAmount= enterAmount/13.1273;
				
			}
			if (chooseCurr.equals("GBP"))
			{ 
				convertedAmount= enterAmount/124.743;
				
			}
			if (chooseCurr.equals("DIHRAM"))
			{ 
				convertedAmount= enterAmount/24.8357;
				
			}
			if (chooseCurr.equals("RAND"))
			{ 
				convertedAmount= enterAmount/5.65563;
				
			} else {
				assume= false;
				System.out.println("Invalid Currency :");
			}
			
			if (assume)
			{
				System.out.printf(" %n%20.2f enterAmount = %.2f %s%n ", enterAmount,convertedAmount, chooseCurr);
				
			}
			
		}
	}
}
