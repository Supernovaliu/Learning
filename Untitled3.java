class VariableTest3 
{
	public static void main(String[] args) 
	{
		double d1 = 12.9;
		int i1 = (int)d1;
		System.out.println(i1);

		int i2 = 128;
		byte b = (byte)i2;
		System.out.println(b);


		char c = 'a';
		int num = 10;
		String str = "hello";
		System.out.println(c+num+str);//a10hello错误,先执行加法然后执行连接
		System.out.println(c+str+num);//ahello10
		System.out.println(c+(num+str));//a10hello
		System.out.println((c+num)+str);//107hello
		System.out.println(str+num+c);//hello10a

		System.out.println('*'+'\t'+'*');
		System.out.println('*'+"\t"+'*');
		System.out.println('*'+'\t'+"*");
		System.out.println('*'+('\t'+"*"));

		String str2 = 3.5f+"";
		System.out.println(str2);
	}
}
