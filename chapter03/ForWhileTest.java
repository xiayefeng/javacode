import java.util.Scanner;

class ForWhileTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int positiveNum = 0; // 正数的个数
		int negativeNum = 0; // 负数的个数


		while(true){
			System.out.print("请输入正数(输入0结束程序):");
			int num = input.nextInt();
			if (num > 0) {
				positiveNum++;
			} else if(num <0){
				negativeNum++;
			} else {
				System.out.println("程序结束");
				break;
			}
		}

		System.out.println("正数的个数:" + positiveNum);
		System.out.println("负数的个数:" + negativeNum);

		input.close();
	}
}
