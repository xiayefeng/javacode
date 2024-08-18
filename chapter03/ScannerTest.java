/*
1.导包 import java.util.Scanner
2.创建 一个 Scanner 实例
3.调用方法
4.关闭资源
*/

import java.util.Scanner;

class ScannerTest{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("请输入你的网名:");
	    String name = scanner.next();

        System.out.print("请输入你的年龄:");
		int age = scanner.nextInt();

        System.out.print("请输入你的体重:");
		double weight = scanner.nextDouble();

		System.out.print("你是否单身(单身：true; 不单身: false):");
		boolean isSingle = scanner.nextBoolean();

		System.out.print("请输入你的性别：(男\\女)");
        char gender = scanner.next().charAt(0); 

		

		System.out.println("网名: " + name + ",年龄: " + age + ",体重: " 
			+ weight + ",是否单身: " + isSingle + ", 性别: " + gender);


        scanner.close();
	}
}
