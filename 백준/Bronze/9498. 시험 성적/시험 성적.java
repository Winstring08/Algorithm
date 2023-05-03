import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String result = "";
		
		if(90<=score && score<=100) {
			result="A";
		} else if(80<=score && score<90) {
			result="B";
		}else if(70<=score && score<80) {
			result="C";
		}else if(60<=score && score<70) {
			result="D";
		}else{
			result="F";
		}
			System.out.println(result);
	}
}  