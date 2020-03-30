//»ç°ú
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int total = 0;
		
		for(int i = 0; i < num; i++) {
			int people = sc.nextInt();
			int apple = sc.nextInt();
			
			total += apple % people;
		}
		
		System.out.println(total);
	}

}
