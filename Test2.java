import java.util.Scanner;
class  Test2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int point = scan.nextInt();
		if (point==100)
		{
			System.out.println("����һ��BMW");
		}else if(80<point&& point<=90){
				System.out.println("����һ��IPAD");
			
		}else{
			System.out.println("ʲô����Ҳû��");
		}
	}
}
