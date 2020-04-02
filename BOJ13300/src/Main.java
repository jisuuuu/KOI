import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[][] arr = new int[2][7]; // �г� ����
		
		for(int i = 0; i < n; i++) {
			int gender = sc.nextInt();
			int grade = sc.nextInt();
			
			arr[gender][grade]++;
		};
		
		int total_count = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 1; j < 7; j++) {
				if(arr[i][j] % k == 0) {
					total_count += arr[i][j] / k; // k�� ���������� ���� �ʿ��� �� ����
				}
				else {
					total_count += (arr[i][j] / k + 1); // k�� �������� ���� ���� �� + 1�� �ʿ��� �� ����
				}
				
			}
		}
		System.out.println(total_count);

	}

}
