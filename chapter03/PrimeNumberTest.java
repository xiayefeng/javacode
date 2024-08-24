/*
 找出 100 以内的素数
*/

class PrimeNumberTest{
	public static void main(String[] args) {
		int num = 100000;

		int count = 0;
		
		//获取系统当前时间 
		long time1 = System.currentTimeMillis();
//		 for(int i=2; i<=num; i++){
//			int number = 0;
//			for(int j =2;j<i; j++){
//				if(i%j ==0){
//					number++;
//				}
//			}
//			if(number == 0) {
//				System.out.println(i);
//			}
//
//		 }
       boolean isFlag = true;
       for(int i=2; i<=num; i++){
			
			for(int j =2;j<= Math.sqrt(i); j++){
				if(i%j == 0) {
					isFlag = false;
					break;
				}
			}
			if(isFlag) {
//				System.out.println(i);
              count++;
			}
			isFlag = true;

		 }
		 System.out.println("质数个数为:" + count);
		 //获取系统当前时间 
		long time2 = System.currentTimeMillis();
		System.out.println("cost 时间为:" + (time2 - time1) + "ms");
	}
}
