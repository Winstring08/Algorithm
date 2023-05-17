import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//과목수 지정
		int N = Integer.valueOf(br.readLine());
		
		//과목 점수 입력하기
		StringTokenizer st = null;
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {			
			arr[i] =  Integer.valueOf(st.nextToken());
		}
		
		//최고 점수(M) 구하기
		int M = 0;
		for(int i=0; i<N; i++) {
			M = arr[i] > M ? arr[i] : M;
			
		}

		//원래 평균 구하기
		float avg = 0;
		for(int a : arr) {
			avg += a;
		}
		avg /= N;
		
		//조작 점수 구하기
		float result = avg * 100 / M ;
		System.out.println(result);
	}

}