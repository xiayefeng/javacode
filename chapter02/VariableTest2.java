class VariableTest2 
{
	public static void main(String[] args) {
		//1.字符类型: char(2字节)

		// 表示形式1：
		char c1='a';
		char c2='中';
		char c3='π';

		//2.unicode值:
		char c4='\u0043';
        char c5='\u0036';

		System.out.println(c4);
		System.out.println(c5);
        
		//3.转义字符
		char c6='\n';
		char c7='\t';
		System.out.println("hell" + c6 + "world");
		System.out.println("hell" + c7 + "world");

		char c8 = 97;
        System.out.println(c8);

       //2.布尔类型: boolean

	   boolean bo1 = true;
	   boolean bo2 = false;
	}
}
