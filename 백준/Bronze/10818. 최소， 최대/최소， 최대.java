import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		ArrayList<Integer> list = new ArrayList<>();
		int N = Integer.valueOf(st.nextToken());
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			list.add(Integer.valueOf(st.nextToken()));
		}
		IntStream intStream = list.stream().mapToInt(Integer::intValue);
		int min = intStream.min().orElse(0);
		intStream = list.stream().mapToInt(Integer::intValue);
		int max = intStream.max().orElse(0);
		
		System.out.println(min+ " " + max);
		}
}