import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] input = new int[30];
		int[] arr = new int[30];
		
		for(int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		
		int from = 0;
		boolean fail = false;
		
		for(int i = 0; i < n; i++) {
			int cnt = 0;
			while(arr[from] != 0) {
				from = (from + 1) % n;
				
				if(cnt++ > n) {
					fail = true;
					break;
				}
			}
			if(fail) {
				break;
			}
			arr[from] = input[i];
			from = (from + input[i]) % n;
		}
		
		if(fail) {
			System.out.println(-1);
		}
		else {
			System.out.println(n);
			for(int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
