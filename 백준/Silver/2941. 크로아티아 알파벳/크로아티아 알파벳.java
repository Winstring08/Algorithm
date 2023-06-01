import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int sLength = s.length();
		int count = sLength;
		
		for(int i=0; i<sLength; i++) {
			switch(s.charAt(i)) {
				case 'c':
					if(i+1<sLength) {
						if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-') {
							count -= 1;
							i++;
						}
					}
					break;
			
				case 'd':
					if(i+1<sLength) {
						if(s.charAt(i+1) == 'z' ) {
							if(i+2<sLength) {
								if(s.charAt(i+2) == '=' ) {
									count -= 2;
									i+=2;
								}
							}
						} else if (s.charAt(i+1) == '-' ) {
							count -= 1;
							i++;
						}
					}
					break;
			
				case 's':
				case 'z':
					if(i+1<sLength) {
						if(s.charAt(i+1) == '=') {
							count -= 1;
							i++;
						}
					}
					break;
					
				case 'l':
				case 'n':
					if(i+1<sLength) {
						if(s.charAt(i+1) == 'j' ) {
							count -= 1;
						}
					}
					break;
			}
			
		}
		
		System.out.println(count);
	}
}
