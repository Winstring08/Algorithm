import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        int c = Integer.valueOf(br.readLine()); //시행 횟수
        
        for(int i=0; i<c; i++) {
        	st = new StringTokenizer(br.readLine()," ");
        	int n = Integer.valueOf(st.nextToken()); //학생 인원수
        	
			/* 학생들 점수 배열 생성 */
        	int[] scores = new int[n];
        	for(int j=0; j<n; j++) { //학생 인원수
        		scores[j] = Integer.valueOf(st.nextToken()); //값 입력
        	}
        	
			/* 학생 평균 구하기 */
        	    int sum = 0;
        		float avg = 0;
        		for(int score : scores) {
        			sum += score;
        		}
        		avg = (float)sum / n;
        		
				/* 평균을 넘은 학생 수 저장*/
        		int count = 0;
        		for(int score : scores) {
        			count = score > avg ? count+1 : count;
        		}       	
        		
				/* 평균을 넘은 학생 비율 */
        		float rate = (float)count/n;   
        		
        		System.out.printf("%.3f%%\n", rate*100);
        }
        }
		}