import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
	int[][] arr = new int[n][m];
	int[][] arr2 = new int[n][m];
	for(int i=0; i<n; i++) {
		st = new StringTokenizer(br.readLine()," ");
		for(int j=0; j<m; j++) {
			arr[i][j] = Integer.valueOf(st.nextToken());
		}
	}
	for(int i=0; i<n; i++) {
		st = new StringTokenizer(br.readLine()," ");
		for(int j=0; j<m; j++) {
			arr2[i][j] = Integer.valueOf(st.nextToken());
		}
	}
	for(int i=0; i<n; i++) {
		for(int j=0; j<m; j++) {
			System.out.print(arr[i][j] + arr2[i][j] + " ");
		}
		System.out.println();
	}
	}
}