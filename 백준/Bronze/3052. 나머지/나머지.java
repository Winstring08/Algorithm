import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> set = new TreeSet<>();
		for(int i=0; i<10; i++) {
			int x = Integer.valueOf(br.readLine());
			set.add(x%42);
		}
		System.out.println(set.size());
	}
}