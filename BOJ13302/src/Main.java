import java.util.Scanner;

public class Main {
	static int[][] dp = new int[110][110];
	static int[] vacation;
	static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		vacation = new int[n + 1];
		int another = sc.nextInt();
		
		for(int i = 0; i < another; i++) {
			int a = sc.nextInt();
			vacation[a] = 1;
		}
		
		System.out.println(solve(1, 0));
	}
	
	public static int solve(int day, int coupon) {
		if(day > n) {
			return 0;
		}
		if(dp[day][coupon] != 0) {
			return dp[day][coupon];
		}
		if(vacation[day] == 1) {
			dp[day][coupon] = solve(day + 1, coupon);
			return dp[day][coupon];
		}
		
		int ans = solve(day + 1, coupon) + 10000;
		ans = Math.min(ans, solve(day + 3, coupon + 1) + 25000);
		ans = Math.min(ans, solve(day + 5, coupon + 2) + 37000);
		
		if(coupon >= 3) {
			ans = Math.min(ans, solve(day + 1, coupon - 3));
		}
		
		dp[day][coupon] = ans;
		return ans;
	}
}
