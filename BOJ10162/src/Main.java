import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		
		if(n % 10 != 0) {
			System.out.println(-1);
			return;
		}
		
		a = n / 300;
		n = n % 300;
		b = n / 60;
		n = n % 60;
		c = n / 10;
		
		System.out.println(a + " " + b + " " + c);
	}

}
