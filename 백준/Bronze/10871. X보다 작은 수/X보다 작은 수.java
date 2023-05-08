import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		ArrayList<Integer> list = new ArrayList<>();
		int N = Integer.valueOf(st.nextToken());
		int X = Integer.valueOf(st.nextToken());
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			list.add(Integer.valueOf(st.nextToken()));
		}
		Stream<Integer> IntStream = list.stream();
		list = IntStream.filter(x-> x < X).collect(Collectors.toCollection(ArrayList::new));
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
			}
			
		}