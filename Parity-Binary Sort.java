import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int j = 0; j < N; j++){
                arr[j] = sc.nextInt();
            }
            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();
            for(int num : arr){
                if(Integer.bitCount(num) % 2 == 0){
                    even.add(num);
                }else{
                    odd.add(num);
                }
            }
            Collections.sort(even);
            Collections.sort(odd);
            for(int num : even){
                System.out.print(num + " ");
            }
            for(int num : odd){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
