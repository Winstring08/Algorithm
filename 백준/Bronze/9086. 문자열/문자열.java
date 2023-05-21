import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++) {
        	String S = br.readLine();
        	sb.append("" + S.charAt(0) + S.charAt(S.length()-1)).append("\n");
        	
        }
        System.out.println(sb);
        
    }
    
}