import java.util.Scanner;

public class Sunrise {
   
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        
        int count = 1;
        int max_height = h[0];
        
        for (int i = 1; i < n; i++) {
            if (h[i] > max_height) {
                count++;
                max_height = h[i];
            }
        }
        
        System.out.println(count);
        sc.close();
    }
    
}
