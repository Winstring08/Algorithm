import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count=0;
        try{
            for(int i=0; i<100; i++){
                input.charAt(i);
                count++;
            }
            
        }catch(StringIndexOutOfBoundsException e){
            
        }
        System.out.println(count);
    }
}