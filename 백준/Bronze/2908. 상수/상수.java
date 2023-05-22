import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String numbers = br.readLine();
	StringTokenizer st = null;
	StringBuilder sb = new StringBuilder();
	for(int i=numbers.length()-1; i>=0; i--) {
		sb.append(numbers.charAt(i));
	}
	String words = String.valueOf(sb);
	st = new StringTokenizer(words," ");
	int A = Integer.valueOf(st.nextToken()); 
	int B = Integer.valueOf(st.nextToken()); 
	System.out.println(A>B?A:B);
	}

}