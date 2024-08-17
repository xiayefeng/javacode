class LogicTest {
	public static void main(String[] args) {
        int a,b;
		a=b = 20;
		boolean bo1 = (++a % 3 == 0) && (a++ % 7 ==0);
        System.out.println("a=" + a + ",bo1 =" + bo1); 

		boolean bo2= (b++ %3 ==0) && (++b % 7 == 0);
        System.out.println("b=" + b + ",bo2 =" + bo2);

		int x = 1;
		int y = 1;
        
		if(x++ == 2 & ++y == 2){
			x = 7;
		}
		System.out.println("x=" + x + ",y=" + y);

		int i=1,j=1;
		if(i++ == 2 && ++j ==2){
		  i = 7;
		}
        System.out.println("i="+i + ", j=" + j);
	}
}
