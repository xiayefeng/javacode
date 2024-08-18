import java.util.Scanner;

class WhileTest1 {
	public static void main(String[] args){

		int random  = (int)(Math.random() * 100) + 1;

		Scanner input = new Scanner(System.in);

		System.out.print("请输入 1-100 范围的一个整数:");

		int guess = input.nextInt();

		int count = 1;

		// System.out.println("Hello World!");
        while(random != guess) {
			if(guess > random) {
				System.out.println("收入的数大了");
			}else if(guess < random) {
				System.out.println("收入的数小了");
			}

			System.out.print("请输入 1-100 范围的一个整数:");
			guess = input.nextInt();
			count++;
        }

		System.out.println("恭喜你" + count + "次猜中了!");

		input.close();
	}
}
