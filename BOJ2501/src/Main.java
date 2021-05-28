import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + 1];

        int j = 1;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                arr[j] = i;
                j++;
            }
        }
        System.out.println(arr[k]);
    }
}
