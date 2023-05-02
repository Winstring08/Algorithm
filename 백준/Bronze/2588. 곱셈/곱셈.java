import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int first = (B%10)*A;
		int second = ((B%100)/10)*A;
		int third = (B/100)*A;
		int result = first + second*10 + third*100 ;
		
		System.out.println(first); 
		System.out.println(second); 
		System.out.println(third); 
		
		System.out.println(result);
	}
}  