class while6
{
	public static void main(String abc[])
	{
		int A = 1;
		while(A<=10)
		{
			int B = 1;
			while(B<=A)
			{
				System.out.print(A);
				if(B<A)
				{
					System.out.print(",");
				}
				else
				{
					System.out.println(".");
				}
				B++;
			}
			A++;
		}
	}
}