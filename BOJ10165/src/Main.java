//망.. 너무 어려움
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Ans {
	int start;
	int end;
	int idx;
	
	public Ans(int start, int end, int idx) {
		this.start = start;
		this.end = end;
		this.idx = idx;
	}
}

public class Main {
	public static boolean compare(Ans a, Ans b) {
		if(a.start < b.start) {
			return true;
		}
		else if(a.start == b.start && a.end > b.end) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Ans> v = new ArrayList<Ans>(m);
		
		int back = 0;
		
		for(int i = 1; i <= m; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			if(s > e) {
				back = Math.max(back, e);
				e += n;
			}
			
			v.add(new Ans(s, e, i));
		}
		Collections.sort((List<Ans>) v);
	}

}
