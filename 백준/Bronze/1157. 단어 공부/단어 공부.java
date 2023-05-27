import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String words = br.readLine();
	int wordsLength = words.length();
	char[] arr = new char[wordsLength];
	for(int i=0; i<wordsLength; i++) {
		arr[i] = words.charAt(i);
	}

	int[] count = new int[26];
	for(char alphabet : arr) {
		if('a'<=alphabet && alphabet<='z') {
			count[alphabet-'a']++;
		} else if('A'<=alphabet && alphabet<='Z') {
			count[alphabet-'A']++;
		}
	}

	int countLength = count.length;
	int Max = 0;
	char answer = 0;
	for(int i=0; i<countLength; i++) {
	if(count[i] > Max) {
		Max = count[i];
		answer = (char)(i+65);
	} else if(count[i] == Max){
		answer = '?';
	}
	}
	System.out.println(answer);
	}
}