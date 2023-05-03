import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int spot1 = sc.nextInt();
		int spot2 = sc.nextInt();
		int spot3 = sc.nextInt();
		int[] spot = {spot1,spot2,spot3};
		int bigSpot = 0;
		for(int spotN : spot) {
			bigSpot = bigSpot < spotN ? spotN : bigSpot;
		}
		
		System.out.println(spot1==spot2 && spot2==spot3 ? 10000 + spot1*1000
				:spot1!=spot2 && spot2 != spot3 && spot3!=spot1 ? bigSpot*100
						: spot1==spot2? 1000 + spot1*100
								: spot2==spot3? 1000 + spot2*100
										: 1000 + spot3*100
				);
	}
}