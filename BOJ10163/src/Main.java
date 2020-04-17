import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stubin
		Scanner sc = new Scanner(System.in);
		
		int[][] map = new int[101][101];
		int[] cnt = new int[101]; //무조건 101 이상이여야함
		int n = sc.nextInt();
		
		for(int k = 1; k <= n; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int i_length = sc.nextInt();
			int j_length = sc.nextInt();
			
			for(int r = i; r < i + i_length; r++) {
				for(int c = j; c < j + j_length; c++) {
					map[r][c] = k;
				}
			}
		}
		
		for(int i = 0; i < 101; i++) {
			for(int j = 0; j < 101; j++) {
				if(map[i][j] != 0) {
					cnt[map[i][j]] += 1;
				}
			}
		}
		for(int i = 1; i <= n; i++) {
			System.out.println(cnt[i]);
		}
	}

}
