/*

基本数据类型与String的运算


*/

class StringTest 
{
	public static void main(String[] args) {
		String str1 = "Hello World!";
		System.out.println(str1);
		System.out.println("Hello World!");

		int num1 = 10;
		boolean b1= true;
		String str2 = "hello";

		String str5 = str2 + b1;

		String str6 = str2 + b1 + num1;

		// String str7 = b1 + num1 + str2;

		System.out.println(str2 +b1);
		System.out.println(str6);

		// System.out.println(str7);

		int num2 = 10;
		String str8 = num2 + "";

		System.out.println(str8);

		int num3 = Integer.parseInt(str8);

		System.out.println(num3);
	}
}
