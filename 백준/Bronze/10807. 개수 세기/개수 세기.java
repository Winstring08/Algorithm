import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		ArrayList<Integer> list = new ArrayList<>();
		int result = 0;
		for(int i=0; i<N; i++) {
			list.add(Integer.valueOf(st.nextToken()));
		}
		int V = Integer.valueOf(br.readLine());
		for(int i : list) {
			if(i==V) {
				result++;
			}
			
		}
		System.out.println(result);
	}
	
}