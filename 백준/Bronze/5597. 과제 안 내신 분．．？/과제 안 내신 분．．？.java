import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[30];
		int x = 0;
		for(int i=0; i<28; i++) {
			x = Integer.valueOf(br.readLine());
			arr[x-1] = 1;
		}
		for(int i=0; i<30; i++) {
			if(arr[i] != 1) {
				System.out.println(i+1);
			}
			}
		}
	}