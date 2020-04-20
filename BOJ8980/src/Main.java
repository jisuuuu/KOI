import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		int m = sc.nextInt();
		
		int[] boxs = new int[n + 1];
		ArrayList<Service> arr = new ArrayList<Service>(m);
		
		for(int i = 0; i < m; i++) {
			int f = sc.nextInt();
			int t = sc.nextInt();
			int b = sc.nextInt();
			
			arr.add(new Service(f, t, b));
		}
		
		Collections.sort(arr);
		
		int total = 0;
		for(Service service : arr) {
			int from = service.from;
			int to = service.to;
			int box = service.box;
			
			int max = 0;
			boolean isLoad = true;
			
			for(int i = from; i < to; i++) {
				if(boxs[i] >= c) {
					isLoad = false;
					break;
				}
				max = Math.max(max, boxs[i]);
			}
			
			if(isLoad) {
				int unloads = c - max;
				if(unloads > box) {
					unloads = box;
				}
				total += unloads;
				
				for(int i = from; i < to; i++) {
					boxs[i] += unloads;
				}
			}
		}
		System.out.println(total);
		
	}

}

class Service implements Comparable<Service>{
	int from;
	int to;
	int box;
	
	public Service(int from, int to, int box){
		this.from = from;
		this.to = to;
		this.box = box;
	}

	@Override
	public int compareTo(Service service) {
		// TODO Auto-generated method stub
		if(this.to < service.to) {
			return -1;
		}
		else if(this.to == service.to) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
}