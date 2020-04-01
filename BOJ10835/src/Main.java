import java.util.Scanner;

public class Main {

	static int[][] dp;
	static int[] left;
	static int[] right;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		left = new int[num];
		right = new int[num];
		dp = new int[num + 1][num + 1];
		
		for(int i = 0; i < num; i++) {
			left[i] = sc.nextInt();
		}
		
		for(int i = 0; i < num; i++) {
			right[i] = sc.nextInt();
		}

		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				dp[i][j] = -1;
			}
		}
		
		System.out.println(func(0, 0));

	}
	
	public static int func(int left_n, int right_n) {
		if(dp[left_n][right_n] != -1) {
			return dp[left_n][right_n];
		}
		
		if(left_n == left.length || right_n == right.length) {
			return 0;
		}
		
		dp[left_n][right_n] = Math.max(func(left_n + 1, right_n), func(left_n + 1, right_n + 1)); // ������ ������ ���ʸ� �����ų� �����ʸ� ���� ����
		
		if(left[left_n] > right[right_n]) { //������ �� Ŭ �� �����ʸ� ���� �Ͱ� �� �� ó��
			dp[left_n][right_n] = Math.max(dp[left_n][right_n], func(left_n, right_n + 1) + right[right_n]);
		}
		
		return dp[left_n][right_n];
	}
}
