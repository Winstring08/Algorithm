import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26]; // 알파벳의 번째수를 담을 배열 생성
		for (int i=0;i<26; i++) {
			arr[i] = -1; // 모든 배열값에 -1저장
		}

		String s = br.readLine(); // 단어를 입력 받음
		for (int i = 0; i < s.length(); i++) {
			if (arr[s.charAt(i) - 'a'] == -1) { // a~z를 0~25번 배열로 두고 아직 값이 대입되지 않은 -1상태에서만
				arr[s.charAt(i) - 'a'] = i; // n번째 알파벳을 의미하는 arr 배열에 m번째수인 i 저장

			}
		}
		for (int i : arr) {
			System.out.print(i + " ");

		}
	}

}