import java.util.Scanner;

class DoWhileTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int operate = 1; // ???????????
		double balance = 0.0;
		do {
          System.out.println("========ATM=========");
		  System.out.println("   1�����");
          System.out.println("   2��ȡ��");
		  System.out.println("   3����ʾ���");
		  System.out.println("   4���˳�");
		  System.out.print("��ѡ��(1-4):");

		  int selection = input.nextInt();

		  switch(selection){
			case 1:
				System.out.print("��������Ľ��:");
			    double money1 = input.nextDouble();
				if(money1 >0){
					balance += money1;
				}
				break;
			case 2:
				System.out.print("������ȡ��Ľ��:");
			    double money2 = input.nextDouble();
				if(balance >= money2 && money2 > 0) {
					balance -= money2;
				} else{
					System.out.println("�����������������");
				}
				break;
			case 3:
				System.out.println("�˻����Ϊ: "+ balance);
				break;
			case 4:
				operate = 0;
			    System.out.println("��лʹ�ã���ӭ�´ι���!");
				break;
			default:
				System.out.println("������������������");
				break;

		  }

		} while(operate != 0);
		// System.out.println("Hello World!");

		input.close();
	}
}
