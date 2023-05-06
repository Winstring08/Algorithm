import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		/*
		 * int A = Integer.valueOf(br.readLine()); 
		 * int B = Integer.valueOf(br.readLine());
		 */
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			sb.append("Case #" + (i+1) + ": " + A + " + " + B + " = " + (A+B) + "\n" );
		}
		System.out.println(sb);
	}
	
}