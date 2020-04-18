import java.util.Scanner;

public class Main {
	static int[][] dp = new int[16][16];
	static int x;
	static int y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int cnt = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if(k == cnt) {
					x = i;
					y = j;
				}
				dp[i][j] = cnt++;
			}
		}
		
		if(k == 0) {
			System.out.println(solve(n, m));
		}
		else {
			System.out.println(solve(x, y) * solve(n - x + 1, m - y + 1));
		}
	}
	
	public static int solve(int x, int y) {
		if(x == 1) {
			return 1;
		}
		if(y == 1) {
			return 1;
		}
		
		dp[x][y] = solve(x - 1, y) + solve(x, y - 1);
		
		return dp[x][y];
	}
}
