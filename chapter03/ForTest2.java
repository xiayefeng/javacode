class ForTest2{
	public static void main(String[] args) {
       int m = 12;
	   int n = 20;
       int min = Math.min(m, n);
	   int result = 1;
       for(int i = 1; i <= min; i++){
		  if(m % i == 0 && n % i == 0){
			  result = i;
		  }
       }

	   System.out.println(result);

	   for(int i = min; i >= 1; i--){
		  if(m % i == 0 && n % i == 0){
			System.out.println("最大公约数为:" + i);
			break;
		  }
       }

	   int max = Math.max(m, n);
	   for(int i=max;i<= m*n;i++){
		  if(i % m == 0 && i % n == 0){
			 System.out.println("最小公倍数为:" + i);
			 break;
		  }
	   }
		System.out.println("Hello World!");
	}
}
