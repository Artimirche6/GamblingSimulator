public class Gambler
{
	public static void main(String[] args)
	{	
		int amount = 100;
		int betAmount = 1;
		int day, newAmount  = 0;
		System.out.println("Gambler initial amount $" +amount);
		System.out.println("Gambler can bet $" +betAmount+ " every game");
		System.out.println();
		
		//System.out.println("Bet value is 1 then WON else LOSS");

		for (day = 1; day <= 10; day++)
		{
			newAmount = newAmount + 100;
			System.out.println("Gambler amount(+$100) $" +newAmount+ " for day " +day);
			amount = newAmount;
			
			System.out.println("New Amount $" +newAmount);
			System.out.println("Exit after half of the New Amount $" +amount/2);
			System.out.println("Exit after double of the New Amount $" +amount*2);
				
		
			while (true)
			{
				if (newAmount == amount/2 || newAmount == amount*2)
				break;
				
				int bet = (int) Math.floor(Math.random() * 10) % 2;
				//System.out.println("Gambler betting value : " +bet);
				
				
				switch(bet)
				{
					
					case 1:
						//System.out.println("GAMBLER WON");
						newAmount = newAmount + 1;
						//System.out.println("Gambler new amount after WIN $" +newAmount);
					break;
					
					default:
						//System.out.println("GAMBLER LOSS");
						newAmount = newAmount - 1;
						//System.out.println("Gambler new amount after LOSS $" +newAmount);
					break;
					
				}
				
			
			}
			
			System.out.println();
			System.out.println("Gambler new amount $" +newAmount+ " after WIN or LOSS for day " +day);
			System.out.println();
			
		}
		
	
	}
}
