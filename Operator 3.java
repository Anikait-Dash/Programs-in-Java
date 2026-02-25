class Operator
{
	public static void main(String[] args)
	{
		int i = 98;
		int j = --i + i-- + ++i + i--;
		
		System.out.println(i);
		System.out.println(j);
	}
}
/*
Output:
96
388
*/
