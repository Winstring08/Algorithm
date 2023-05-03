import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int time = sc.nextInt();
		int timeH = time/60;   
		int timeM = time%60;  
		int resultH = H+timeH; 
		int resultHour = resultH>=24 ? resultH-24 : resultH;
		int resultM = M+timeM; 
		System.out.println(
				resultM < 60 ? resultHour + " " + resultM 
						: resultHour+1 == 24 ? 0 + " " + (resultM-60)
								: resultHour+1 + " " + (resultM-60)
				);
	}
}