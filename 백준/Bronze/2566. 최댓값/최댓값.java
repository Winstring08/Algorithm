import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		//배열 생성
		int[][] numberArr = new int[9][9];
		
		//배열 값 입력
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<9; j++) {
				numberArr[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		//최대값 구하기
		int max = -1;
		int line = -1;
		int row = -1;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(numberArr[i][j] > max) {
					max = numberArr[i][j];
					line = i+1;
					row = j+1;
				}
			}
		}
		
		//출력
		System.out.println(max);
		System.out.print(line+ " " + row);
	}
}