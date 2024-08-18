import java.util.Scanner;

class DoWhileTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int operate = 1; // ???????????
		double balance = 0.0;
		do {
          System.out.println("========ATM=========");
		  System.out.println("   1、存款");
          System.out.println("   2、取款");
		  System.out.println("   3、显示余额");
		  System.out.println("   4、退出");
		  System.out.print("请选择(1-4):");

		  int selection = input.nextInt();

		  switch(selection){
			case 1:
				System.out.print("请输入存款的金额:");
			    double money1 = input.nextDouble();
				if(money1 >0){
					balance += money1;
				}
				break;
			case 2:
				System.out.print("请输入取款的金额:");
			    double money2 = input.nextDouble();
				if(balance >= money2 && money2 > 0) {
					balance -= money2;
				} else{
					System.out.println("输入的数据有误余额不足");
				}
				break;
			case 3:
				System.out.println("账户余额为: "+ balance);
				break;
			case 4:
				operate = 0;
			    System.out.println("感谢使用，欢迎下次光临!");
				break;
			default:
				System.out.println("收入有误，请重新输入");
				break;

		  }

		} while(operate != 0);
		// System.out.println("Hello World!");

		input.close();
	}
}
