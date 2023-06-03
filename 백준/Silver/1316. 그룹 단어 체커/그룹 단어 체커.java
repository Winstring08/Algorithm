import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine()); // 반복 횟수 입력
		int successCount = n; // 몇개의 단어가 성공인지 체크할 변수
		for (int i = 0; i < n; i++) { // n회 반복
			String word = br.readLine(); // 단어 입력받음
			int wordLength = word.length(); // 단어의 길이 저장
			char[] alphabetArr = new char[wordLength]; // 알파벳을 저장할 빈 배열 생성
			boolean thisIsFail = false;
			for (int j = 0; j < wordLength; j++) { // 단어의 길이만큼 반복
				if (j == 0) {
					alphabetArr[j] = word.charAt(j); // 첫번째 알파벳은 그냥 배열에 저장
				} else {
					if (word.charAt(j) != alphabetArr[j - 1]) { // 다르면
						for (char alphabet : alphabetArr) { // 배열에 저장된 모든 알파벳에 대해 반복
							if (alphabet == word.charAt(j)) { // 배열에 저장된 알파벳중에 현재 알파벳과 일치하는게 있다면
								successCount--; // 성공한 단어 개수 -1
								thisIsFail = true; // 이번 단어는 실패처리
								break; // 현재 반복문 즉시 종료
							}
						}
						
					}
					if (thisIsFail) { // 실패처리 된경우
						break; // 현재 단어 반복을 중지하고 다음 단어반복으로 넘어감
					} else {
						alphabetArr[j] = word.charAt(j); // 배열에 그 새로운 알파벳을 저장
					}

				}

			}

		}
		System.out.println(successCount);
	}
}
