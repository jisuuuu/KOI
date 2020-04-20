import java.util.Scanner;

class Country{
	int country;
	int g;
	int s;
	int b;
	
	public Country(int country, int g, int s, int b) {
		this.country = country;
		this.g = g;
		this.s = s;
		this.b = b;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int idx = 0;
		int ans = 1; //자신보다 잘한 나라 수 + 1
		
		Country[] arr = new Country[n + 1];
		
		for(int i = 1; i <= n; i++) {
			int country = sc.nextInt();
			int g = sc.nextInt();
			int s = sc.nextInt();
			int b = sc.nextInt();
			
			if(k == country) {
				idx = i;
			}
			
			arr[i] = new Country(country, g, s, b);
		}
		
		sc.close();
		
		for(int i = 1; i <= n; i++) {
			if(arr[i].g > arr[idx].g) {
				ans++;
			}
			else if(arr[i].g == arr[idx].g){
				if(arr[i].s > arr[idx].s) {
					ans++;
				}
				else if(arr[i].s == arr[idx].s) {
					if(arr[i].b > arr[idx].b) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}

}