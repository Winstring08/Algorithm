import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s =br.readLine();
	int length = s.length();
	int answer = 1;
	for(int i=0; i<length; i++) {
		if(i>(length-1)-i) {
			answer = s.charAt(i) != s.charAt( (length-1) -i ) ? 0 : answer;
		}
	}
	System.out.println(answer);
	
	}
	}