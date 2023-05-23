
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int time = 0;
		for(int i = 0; i<S.length(); i++) {
			int c = S.charAt(i);
			if( c <= 67 ) {
				time +=3;
			} else if( c <= 70 ) {
				time += 4;
			} else if( c <= 73 ) {
				time += 5;
			} else if( c <= 76 ) {
				time += 6;
			} else if( c <= 79 ) {
				time += 7;
			} else if( c <= 83 ) {
				time += 8;
			}else if( c <= 86 ) {
				time += 9;
			}else {
				time += 10;
			}
			}
		System.out.println(time);
		}
		
	}