class ForTest {
	public static void main(String[] args) {
		int oddNum = 0;
		int oddSum = 0;
		for(int i=1; i<=100; i++){
		  if(i%2 == 0) {
			oddNum++;
			oddSum += i;
		  }
		}
		System.out.println("oddNum = " + oddNum + ", oddSum = " + oddSum);
		// System.out.println("Hello World!");
		for(int i=100; i<= 999; i++){
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100;
			if(Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == i) {
				System.out.println(i);
			}
		}
	}
}
