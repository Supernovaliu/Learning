import java.util.Scanner;
class  CharSwitch
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		char alp = scan.next().charAt(0);
		switch(alp){
			case 'a':
				System.out.println("A");
			break;
			case 'b':
				System.out.println("B");
			break;
			case 'c':
				System.out.println("C");
			break;
			case 'd':
				System.out.println("D");
			break;
			case 'e':
				System.out.println("E");
			break;
			default:
				System.out.println("other");
		}
	}
}
