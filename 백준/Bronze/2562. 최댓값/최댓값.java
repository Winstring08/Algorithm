import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<9; i++) {
			list.add(Integer.valueOf(br.readLine()));
		}
		int tmp = 0;
		int n = 0;
		for(int i=0; i<list.size(); i++) {
			tmp = tmp < list.get(i) ? list.get(i) : tmp;
			n = list.get(i)==tmp ? (i+1) : n;
		}
System.out.println(tmp);
System.out.println(n);
		}
}