import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int answer = 0;
		int n = Integer.valueOf(br.readLine());
		boolean[][] area = new boolean[100][100];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.valueOf(st.nextToken()); 
			int y = Integer.valueOf(st.nextToken());
			for(int j=0; j<10; j++) {
				for(int k=0; k<10; k++) {
					area[x+j][y+k] = true;
				}
			}
		}
		for(int j=0; j<100; j++) {
			for(int k=0; k<100; k++) {
				if(area[j][k] == true) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}