//100�����������������.��2��ʼ��n-1�����������ܱ��������������
class PrimeNumberTest 
{
	public static void main(String[] args) {
		
		boolean isFlag = true;
		//��ʶi�Ƿ�j������
	long start	= System.currentTimeMillis();//��ȡ��ǰʱ��
		for (int i=2;i<=100000 ;i++ ){
			//boolean isFlag = true;
			//�Ա�������������Ȼ������Ч��
			for (int j = 2;j<Math.sqrt(i) ;j++ ){//Math.sqrt()����
				if(i%j==0){
				isFlag = false;
				break;//�Ż�һ��ֻ�Ա������������Ȼ����Ч
				}
			}

			if(isFlag ==true){
			System.out.println(i);
		}
		   isFlag = true;
		}
           long end = System.currentTimeMillis();
		   System.out.println(""+(end-start));
	}
}
