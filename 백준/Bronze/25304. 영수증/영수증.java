import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long X = Long.valueOf(br.readLine());
		int Y = Integer.valueOf(br.readLine());
		StringTokenizer st = null;
		Long sum = 0L;
		
		for(int i=0; i<Y; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sum += Long.valueOf(st.nextToken())*Long.valueOf(st.nextToken());
		}
		System.out.println(sum - X == 0 ? "Yes" : "No");
	}
}