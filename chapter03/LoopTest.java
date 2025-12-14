class LoopTest {
	public static void main(String[] args) {
		for(int j=0; j<5;j++){
			for(int i=1;i<=6;i++){
			  System.out.print('*');
		    }
            System.out.println();
		}
		
		System.out.println("###################");
	//	System.out.println("Hello World!");

	   for(int i=1;i<=6;i++){
		 for(int j=1;j<=i;j++){
			System.out.print("*");
		 }
		 System.out.println();
	   }

	   for(int i=1;i<6;i++){
		 for(int j=1;j<=6-i;j++){
			System.out.print("*");
		 }
		 System.out.println();
	   }



	   for(int i =1; i<=5;i++) {
		  for(int j=1;j<=10- 2*i;j++){
			System.out.print(" ");
		  }

		  for(int k=1; k<= 2*i -1;k++){
			System.out.print("* ");
		  }
		  System.out.println();
	   }
	   for(int i=1; i< 5; i++){
		 for(int j=1;j<=2*i;j++){
			System.out.print(" ");
		  }
		   for(int k=1; k<= 9 - 2 * i;k++){
			System.out.print("* ");
		  }
		  System.out.println();
	   }
	}
}

/*
  菱形的下半部分
    i             j            k       2*i + k = 9
	1             2            7       k = 9 - 2 * i
	2             4            5       j = 2 * i
	3             6            3
	4             8            1



*/