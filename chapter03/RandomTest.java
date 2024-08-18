/*
 获取一个[a,b]范围的随机整数
  num  = (int)(Math.random() * (b - a + 1)) + a;
*/

class RandomTest {
	public static void main(String[] args) {
        double d1 = Math.random();

		System.out.println("d1 = " + d1);

		int num1 = (int)(Math.random() * 101);

        System.out.println("num1 = " + num1);

        int num2 = (int)(Math.random() * 100) + 1;
		System.out.println("num2 = " + num2);
	}
}
