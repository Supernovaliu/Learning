
class  ForTest
{
	public static void main(String[] args) 
	{
		for(int i = 1;i <=5;i++){
			System.out.println("Hello World");
		}

		int num = 1;
		for (System.out.print('a');num<=3 ;System.out.print('c'),num++ )
		{
			System.out.print('b');//abcbcbc
		}
		//���⣺����100���ڵ�ż��,�������ż���ĺ�
		int sum = 0;
		int count = 0;
		for (int i = 1;i <= 100 ;i++ )
		{
			if(i%2==0){
				System.out.println(i);
				sum += i;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
	}
}