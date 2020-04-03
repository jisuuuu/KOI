import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] memo = new long[n + 1];
		
		memo[0] = 1;
		memo[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}
		System.out.println(2 * memo[n] + 2 * memo[n - 1]);
	}

}
