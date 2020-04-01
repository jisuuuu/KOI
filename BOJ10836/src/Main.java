//다시 풀기
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] arr = new int[m][m];
		int[][] list = new int[n][2 * m - 1];
		
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = 1;
			}
		}
		
		for(int i = 0; i < n; i++) {
			int zero = sc.nextInt();
			int one = sc.nextInt();
			int two = sc.nextInt();
			
			int j;
			for(j = 0; j < zero; j++) {
				list[i][j] = 0;
			}
			for(j = zero; j < zero + one; j++) {
				list[i][j] = 1;
			}
			for(j = (zero + one); j < (zero + one + two); j++) {
				list[i][j] = 2;
			}
			
			int ans_i = m - 1;
			int ans_j = 0;
			for(j = 0; j < 2 * m - 1; j++) {
				if(ans_i == 0) {
					arr[ans_i][ans_j] = arr[ans_i][ans_j] + list[i][j];
					ans_j++;
				}
				else {
					arr[ans_i][ans_j] = arr[ans_i][ans_j] + list[i][j];
					ans_i--;
				}
			}
			
			for(int k = 1; k < m; k++) {
				for(j = 1; j < m; j++) {
					arr[k][j] = Math.max(Math.max(arr[k][j - 1], arr[k - 1][j - 1]), arr[k - 1][j]);
				}
			}
 		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
