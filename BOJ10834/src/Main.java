import java.util.Scanner;

//��Ʈ
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		char position = 'a';
		int first = 0;
		int second = 0;
		int third = 0;
		
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				first = sc.nextInt();
				second = sc.nextInt();
				third = sc.nextInt();
				
				if(position == 'a' && third == 1) {
					position = 'b';
				}
				else if(position == 'b' && third == 1) {
					position = 'a';
				}
				else if(position == 'a' && third == 0) {
					position = 'a';
				}
				else if(position == 'b' && third == 0) {
					position = 'b';
				}
				continue;
			}
			first = sc.nextInt();
			
			if(first == 0) {
				break;
			}
			int num = second / first;
			second = sc.nextInt();
			second = second * num;
			
			third = sc.nextInt();
			
			if(position == 'a' && third == 1) {
				position = 'b';
			}
			else if(position == 'b' && third == 1) {
				position = 'a';
			}
			else if(position == 'a' && third == 0) {
				position = 'a';
			}
			else if(position == 'b' && third == 0) {
				position = 'b';
			}
		}
		
		if(position == 'a') {
			System.out.println(0 + " " + second);
		}
		else {
			System.out.println(1 + " " + second);
		}
	}

}
