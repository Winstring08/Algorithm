import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine()," ");
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int[] arr = new int[N];
		for(int n=0; n<N; n++) {
			arr[n] = n+1;
		}
		int tmp = 0;
		for(int x=1; x<=M; x++) {
			st = new StringTokenizer(br.readLine()," ");
			int i = Integer.valueOf(st.nextToken());
			int j = Integer.valueOf(st.nextToken());
			tmp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = tmp;
			
		}
		
		for(int a : arr) {
			System.out.print(a+ " ");
		}
	}
}