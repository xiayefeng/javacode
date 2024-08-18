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
	}
}
