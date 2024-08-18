import java.util.Scanner;

class SwitchCaseTest {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		System.out.println("请输入2023年的月份: ");
		int month = input.nextInt();

        System.out.println("请输入2023年的天: ");
		int day = input.nextInt();

		int sumDays = 0;

		int [] daysList  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		switch(month) {
		  case 12:
			  sumDays += daysList[month - 1]; // 11月份总天数
		  case 11:
			  sumDays += 31; // 10月份总天数
		  case 10:
			  sumDays += 30; // 9月份总天数
          case 9:
			  sumDays += 31; // 8月份总天数
		  case 8:
			  sumDays += 31; // 7月份总天数
          case 7:
			  sumDays += 30; // 6月份总天数
		  case 6:
			  sumDays += 31; // 5月份总天数
          case 5:
			  sumDays += 30; // 4月份总天数
		  case 4:
			  sumDays += 31; // 3月份总天数
		  case 3:
			  sumDays += 28; // 2月份总天数
		  case 2:
			  sumDays += 31; // 1月份总天数
		  case 1:
			  sumDays += day;
		      break;
		}

		System.out.println("2023年" + month + "月" + day + "日是当前的第" + sumDays + "天");

		input.close();
	}
}
