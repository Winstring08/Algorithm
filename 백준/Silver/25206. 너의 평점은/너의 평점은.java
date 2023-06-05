import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		Map<String,Float> map = new HashMap<>();
		map.put("A+", 4.5f);
		map.put("A0", 4.0f);
		map.put("B+", 3.5f);
		map.put("B0", 3.0f);
		map.put("C+", 2.5f);
		map.put("C0", 2.0f);
		map.put("D+", 1.5f);
		map.put("D0", 1.0f);
		map.put("F", 0.0f);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		float sum = 0;
		float gradeSum = 0;
		for(int i=0; i<20; i++) {
			st = new StringTokenizer(br.readLine(), " " );
			st.nextToken();
			float credit = Float.valueOf(st.nextToken());
			String grade = st.nextToken();
			if( grade.equals("P")) {
				continue; 
			}
				float gradePoint = map.get(grade);
				sum += credit * gradePoint;
				gradeSum += credit;
			
		}
		if(gradeSum==0) {
			System.out.println(0);
		}else {
			System.out.println(sum / gradeSum);
		}
		
		

	}
}