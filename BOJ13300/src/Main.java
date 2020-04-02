import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[][] arr = new int[2][7]; // 학년 별로
		
		for(int i = 0; i < n; i++) {
			int gender = sc.nextInt();
			int grade = sc.nextInt();
			
			arr[gender][grade]++;
		};
		
		int total_count = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 1; j < 7; j++) {
				if(arr[i][j] % k == 0) {
					total_count += arr[i][j] / k; // k로 나눠질때는 몫이 필요한 방 갯수
				}
				else {
					total_count += (arr[i][j] / k + 1); // k로 나눠지지 않을 때는 몫 + 1이 필요한 방 갯수
				}
				
			}
		}
		System.out.println(total_count);

	}

}
