import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        if(s.contains("HH")){
            System.out.println("NO");
            return;
        }
        char []arr = s.toCharArray();
        for(int i = 0 ; i < n ;i++){
            if(arr[i] == '.'){
                arr[i] = 'B';
            }
        }     
        System.out.println("YES");
        System.out.println(new String(arr));       
    }
}
