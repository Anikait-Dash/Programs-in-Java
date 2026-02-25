class Operator
{
	public static void main(String[] args)
	{
		int m = 5;
		int n = m++ + ++m + m++ + m--;

		System.out.println(m);
		System.out.println(n);
	}
}
//Output:
//7
//27
