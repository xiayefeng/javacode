class WhileTest2{
	public static void main(String[] args){
		double goHeight = 8848860;
		double paper = 0.1;
        int count = 0;
		while(paper <= goHeight){
			paper *= 2;
			count++;
		}
		System.out.println(count);
		System.out.println(paper / 1000);
	}
}
