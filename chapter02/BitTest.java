class BitTest{
	public static void main(String[] args) {
		int num1 = 7;
		System.out.println("num1 << 2: " + (num1 << 1));
		System.out.println("num1 << 2: " + (num1 << 2));
		System.out.println("num1 << 2: " + (num1 << 3));
        System.out.println("num1 << 28: " + (num1 << 28));
		System.out.println("num1 << 29: " + (num1 << 29));

		int num2 = -7;
		System.out.println("num2 << 2: " + (num2 << 1));
		System.out.println("num2 << 2: " + (num2 << 2));
		System.out.println("num2 << 2: " + (num2 << 3));
	}
}
