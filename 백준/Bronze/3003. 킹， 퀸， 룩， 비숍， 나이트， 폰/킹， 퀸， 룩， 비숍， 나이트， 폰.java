import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
	int[] arr = {1,1,2,2,2,8};
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = null;
	st = new StringTokenizer(br.readLine()," ");
	StringBuilder sb = new StringBuilder();
	int arrL = arr.length;
	for(int i=0; i<arrL; i++) {
		 sb.append(arr[i] - Integer.valueOf(st.nextToken()) + " "); 
	}
	System.out.println(sb);
	}

}