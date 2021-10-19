public class Gambler
{
	public static void main(String[] args)
	{	
		int amount = 100;
		int betAmount = 1;
		
		System.out.println("Gambler initial amount $" +amount);
		System.out.println("Gambler can bet $" +betAmount+ " every game");
		System.out.println();
		System.out.println("Bet value is 1 then WON else LOSS");
		
		int bet = (int) Math.floor(Math.random() * 10) % 2;
		System.out.println("Gambler betting value : " +bet);
		
		System.out.println("");
		
		if (bet == 1)
		{
			System.out.println("GAMBLER WON");
			amount = amount + 1;
			System.out.println("Gambler new amount after WIN $" +amount);
		}
		else
		{
			System.out.println("GAMBLER LOSS");
			amount = amount - 1;
			System.out.println("Gambler new amount after LOSS $" +amount);
		}
		
		
		
	}
}
