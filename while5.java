class while5
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
				B++;
			}
			System.out.println();
			A++;
		}
	}
}