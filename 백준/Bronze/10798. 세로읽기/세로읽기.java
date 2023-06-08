import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//배열 생성
		char[][] alphabetArr = new char[5][15];
		
		//배열에 단어 5개 저장
		for(int i=0; i<5; i++) {
			String word = br.readLine();
			int wordLength = word.length();
			
			for(int j=0; j<wordLength; j++) {
				alphabetArr[i][j] = word.charAt(j);
			}
		}
		
		//배열을 세로로 출력
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(alphabetArr[j][i] != '\u0000') {
					System.out.print(alphabetArr[j][i]);
				}
			}
		}
	}
}