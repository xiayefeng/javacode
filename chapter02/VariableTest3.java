/*
���Ի����������ͱ�������������
���򣺵�����С�ı�����������ı���������ʱ������Զ�ת��Ϊ��������������͡�

 byte\short\char ---> int ---> long ---> float ---> double
  
  �ر�ģ�byte��short��char ���͵ı���֮ǰ�����㣬���Ϊ int ���͡�

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

        // ���벻ͨ��
		// short s2 = b3 + s1;

		

		byte b4=10;

        char c1 = 'a';

		int i4 = c1 + b3;

		// **************************************************************



		System.out.println("Hello World!");
	}
}
