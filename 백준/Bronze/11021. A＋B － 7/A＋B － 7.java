import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int T =  Integer.valueOf(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append("Case #" + (i+1) + ": " + (Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken()))+"\n");
		}
		System.out.println(sb);

	}

}