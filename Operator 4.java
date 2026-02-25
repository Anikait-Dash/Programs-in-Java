class Operator
{
	public static void main(String[] args)
	{
		int p = 35;
		int q = ++p + --p + p-- + p++ + --p + ++p + --p;
		System.out.println(p);
		System.out.println(q);
	}
}
/*
  Output:
  34
  243
*/
