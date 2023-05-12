

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine()," ");
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		int[] arr = new int[N];
		
		for(int x=0; x<M; x++) {
		st = new StringTokenizer(br.readLine()," ");
		int i = Integer.valueOf(st.nextToken());
		int j = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		for(int y=i; y<=j; y++) {
			arr[y-1] = k;
		}
		}
		for(int n : arr) {
			System.out.print(n+ " ");
		}
	}

}