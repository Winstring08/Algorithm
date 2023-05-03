import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		int A = 0;
		int B = 0;
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.valueOf(st.nextToken()) + Integer.valueOf(st.nextToken()) + "\n");
		}
		System.out.println(sb);

	}
}