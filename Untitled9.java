class SetValueTest 
{
	public static void main(String[] args) 
	{
		int i1 =10;
		int j1 =10;

		int i2,j2;
        i2 = j2 = 10;
		int i3 = 10,j3 = 20;

		int num1 = 10;
		num1 += 2;
		System.out.println(num1);

		int num2 = 12;
		num2 %=5;
		System.out.println(num2);

		short s1 = 10;
		//s1 = s1+2;
		s1 += 2;//����ı�����������������
		System.out.println(s1);


		int m = 2;
		int n = 3; 
		n *= m++; 
		System.out.println("m=" + m); 
		
		System.out.println("n=" + n);


		int n1 = 10; 
		n1 += (n1++) + (++n1); 
		System.out.println(n1);



	}
}
