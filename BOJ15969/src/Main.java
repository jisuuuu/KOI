import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n == 2) {
			int n_1 = sc.nextInt();
			int n_2 = sc.nextInt();
			
			System.out.println(Math.abs(n_1 - n_2));
			
			return;
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++) {
			int s = sc.nextInt();
			
			if(min > s) {
				min = s;
			}
			else if(max < s) {
				max = s;
			}
		}
		
		System.out.println(max - min);
	}

}
