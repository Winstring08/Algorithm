import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.valueOf(st.nextToken());
		int y = Integer.valueOf(st.nextToken());
		int w = Integer.valueOf(st.nextToken());
		int h = Integer.valueOf(st.nextToken());
		
		int width = w - x ;
		width = width < x ? width : x; 
		int height = h - y ;
		height = height < y ? height : y; 
		System.out.println(width<height ? width : height);
	}
}