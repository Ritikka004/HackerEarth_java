import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] cost = br.readLine().split(" ");
            int green = Integer.parseInt(cost[0]);
            int purple = Integer.parseInt(cost[1]);
            int n = Integer.parseInt(br.readLine());
            int p1 = 0;
            int p2 = 0;
            for(int i = 0; i < n; i++){
                String[] arr = br.readLine().split(" ");
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[1]);
                if(a == 1) p1++;
                if(b == 1) p2++;
            }
            int cost1 = p1 * green + p2 * purple;
            int cost2 = p1 * purple + p2 * green;
            System.out.println(Math.min(cost1, cost2));
        }
    }
}
