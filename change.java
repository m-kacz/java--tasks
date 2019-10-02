class change
{
	public static void main(String abc[])
	{
		int bill, paid, balance;
		bill=1;
		paid=50;
		balance=paid-bill;
		int noNotes;

		System.out.println("Total: \u00A3"+bill);
		System.out.println("Amount paid: \u00A3"+paid);
		System.out.println("----------------------------");
		System.out.println("Change due: \u00A3"+balance);
		System.out.println("----------------------------");
		System.out.println("Please give the following in change:");
		if(balance>=50)
		{
			noNotes = balance/50;
			System.out.println("\u00A350 notes:"+noNotes);
			balance -= (noNotes * 50);
		}
		if(balance>=20)
		{
			noNotes = balance/20;
			System.out.println("\u00A320 notes:"+noNotes);
			balance -= (noNotes * 20);
		}
		if(balance>=10)
		{
			noNotes = balance/10;
			System.out.println("\u00A310 notes:"+noNotes);
			balance -= (noNotes * 10);
		}
		if(balance>=5)
		{
			noNotes = balance/5;
			System.out.println("\u00A35 notes:"+noNotes);
			balance -= (noNotes * 5);
		}
		if(balance>=2)
		{
			noNotes = balance/2;
			System.out.println("\u00A32 coins:"+noNotes);
			balance -= (noNotes * 2);
		}
		if(balance>=1)
		{
			noNotes = balance/1;
			System.out.println("\u00A31 coins:"+noNotes);
			balance -= (noNotes * 1);
		}
	}
}