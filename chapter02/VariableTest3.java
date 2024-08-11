/*
测试基本数据类型变量间的运算规则
规则：当容量小的变量与容量大的变量做运算时，结果自动转换为容量大的数据类型。

 byte\short\char ---> int ---> long ---> float ---> double
  
  特别的：byte、short、char 类型的变量之前做运算，结果为 int 类型。

*/

class VariableTest3 
{
	public static void main(String[] args) {
        int i1 =10;
		int i2=i1;

		long l1 = i1;

		float f1 = l1;

		byte b1 = 12;

		int i3 = b1 + i1;

		byte b3 = 12;
		
		short s1= 10;

        // 编译不通过
		// short s2 = b3 + s1;

		

		byte b4=10;

        char c1 = 'a';

		int i4 = c1 + b3;

		// **************************************************************



		System.out.println("Hello World!");
	}
}
