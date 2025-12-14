class BitExer{
	public static void main(String[] args){
       int m = 10;
	   int n = 20;

	   System.out.println("m = " + m + ", n = " + n);

	   // 交换两个变量
	  // 方式一
	  // int temp = m;
	  //  m = n;
	  //  n = temp;

	  // 方式二
	  // m = m +n;
	  // n = m -n;
	  // m = m -n;

	  // 方式三
	  m = m ^ n;
	  n = m ^ n;
	  m = m ^ n;

	   System.out.println("m = " + m + ", n = " + n);
	}
}
