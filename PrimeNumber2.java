class PrimeNumber2 
{
	public static void main(String[] args) 
	{
		long start = System.currentTimeMillis();
		
		int count = 0;
		label:for (int i = 2;i<=1000000 ;i++ )
		{
            boolean isFlag = true;
			for (int j = 2;j<=Math.sqrt(i) ;j++ )
			{
				if (i%j==0)
				{
					isFlag = false;
					break;
				}
			}
			if (isFlag==true)
			{
				count++;
			}
			
		}
		long end = System.currentTimeMillis();
		System.out.println("�����ĸ���Ϊ:"+count);
		System.out.println("�����ѵ�ʱ��Ϊ:"+(end-start));
	}
}
