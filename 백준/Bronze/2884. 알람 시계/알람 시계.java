import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		System.out.println(M-45>=0 ? H + " " + (M-45) : H-1<0 ? 23+" " + (60+M-45) : H-1 + " " + (60+M-45));
	}
}