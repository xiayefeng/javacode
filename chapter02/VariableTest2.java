class VariableTest2 
{
	public static void main(String[] args) {
		//1.�ַ�����: char(2�ֽ�)

		// ��ʾ��ʽ1��
		char c1='a';
		char c2='��';
		char c3='��';

		//2.unicodeֵ:
		char c4='\u0043';
        char c5='\u0036';

		System.out.println(c4);
		System.out.println(c5);
        
		//3.ת���ַ�
		char c6='\n';
		char c7='\t';
		System.out.println("hell" + c6 + "world");
		System.out.println("hell" + c7 + "world");

		char c8 = 97;
        System.out.println(c8);

       //2.��������: boolean

	   boolean bo1 = true;
	   boolean bo2 = false;
	}
}
