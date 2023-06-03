import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine()); // 검사할 단어 갯수 입력
		int groupwordCount = n; // 최종적으로 몇개의 단어가 성공인지 체크할 변수
		
		for (int i = 0; i < n; i++) { // n개의 단어에 대해 반복
			String word = br.readLine(); // 단어 하나를 입력받음
			int wordLength = word.length(); // 단어의 길이 저장
			char[] alphabetArr = new char[wordLength]; // 등장한 알파벳을 저장할 빈 배열 생성
			boolean thisIsNotGroup = false; //그룹단어가 아닐때 단어 탐색을 즉시 중지하기 위한 변수
			
			for (int j = 0; j < wordLength; j++) { // 그룹단어인지 확인하기 위해 현재 단어의 알파벳 개수만큼 반복
				char currentAlphabet = word.charAt(j); //현재 반복문 수행중인 알파벳을 저장
				
				if (j == 0) { //첫번째 알파벳의 경우
					alphabetArr[j] = currentAlphabet; // 첫번째 알파벳이라면 그냥 배열에 저장
				} else { //두번째 이후부터는
					if (currentAlphabet != alphabetArr[j - 1]) { // 직전에 등장한 알파벳과 다른 알파벳이라면
						
						for (char alphabet : alphabetArr) { // 등장했던 알파벳을 저장해놓은 배열 alphabetArr에 대해 반복
							if (alphabet == currentAlphabet) { // 배열에 저장된 알파벳들중에 현재 알파벳과 일치하는게 있다면
								groupwordCount--; // 그룹 단어가 아니게되므로 성공 카운트를 1 줄임
								thisIsNotGroup = true; // 이 단어의 단어 탐색을 더이상 하지 않기위해 true를 저장 
								break; // 등장했던 알파벳과 현재 알파벳을 대조하는 현재 반복문을 종료
							}
						}
					}
					
					if (thisIsNotGroup) { // 그룹단어인지 아닌지 확인
						break; // 그룹단어인지 확인하는 현재 반복문을 즉시 종료
					} else { //그룹단어가 아니라고 판명나지 않았다면
						alphabetArr[j] = currentAlphabet; // 배열에 현재 탐색하고있는 알파벳을 저장, 이후 계속 탐색
					}

				}

			}

		}
		System.out.println(groupwordCount); //걸러지지 않은 단어 개수를 출력
	}
}
