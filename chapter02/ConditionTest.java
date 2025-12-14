class  ConditionTest{
	public static void main(String[] args) {
		String str = (2>10) ? "表达式1": "表达式2";
		System.out.println(str);

		double result = (2>1) ? 1 : 2.0;
        System.out.println(result);

		int m =20;
		int n = 10;

		int max = m > n ? m : n;
		System.out.println("较大值为: " + max);

		int i = 20;
		int j =30;
		int k = 23;
        
		int tempMax = i > j ? i: j;
        System.out.println("较大值为: " + (tempMax > k ? tempMax : k));
	}
}
