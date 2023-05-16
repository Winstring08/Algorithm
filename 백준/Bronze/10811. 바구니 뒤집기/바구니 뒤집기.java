import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.valueOf(st.nextToken()); //바구니의 개수
        int M = Integer.valueOf(st.nextToken()); //시행 횟수
        
        int[] arr = new int[N+1]; //바구니 생성
        
        //바구니에 공넣기
        for(int x=0; x<N+1; x++) {
        	arr[x] = x;
        }
        
        //역순으로 M번 뒤집기
        int tmp = 0;
        for(int x=0; x<M; x++) {
        	st = new StringTokenizer(br.readLine()," ");
            
            int i = Integer.valueOf(st.nextToken()); //바구니의 개수
            int j = Integer.valueOf(st.nextToken()); //시행 횟수
        	
        	//양 끝 바구니부터 공 바꾸기
        	while(i<j) {
        		tmp = arr[j];
            	arr[j] = arr[i];
            	arr[i] = tmp;
            	i++;
            	j--;
        	}
        	
        }
        
        //출력하기
        for(int a : arr) {
        	if(a != 0) {
        		System.out.print(a + " ");
        	}
        }
   
    }
}