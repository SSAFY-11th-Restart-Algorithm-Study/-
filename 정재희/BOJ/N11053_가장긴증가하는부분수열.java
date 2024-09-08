package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11053_가장긴증가하는부분수열 {
	/**
	 * 12,092KB | 84ms
	 */
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] LIS = new int[N];
		
		for(int i=0;i<N;i++) {
			LIS[i] = 1;
			for(int j=0; j<i;j++) {
				if(arr[i] > arr[j] && LIS[i] < LIS[j]+1)
					LIS[i] = LIS[j]+1;
			}
		}
		int maxVal = Integer.MIN_VALUE;
		for(int i=0;i<N;i++) {
			maxVal = Math.max(maxVal, LIS[i]);
		}
		System.out.println(maxVal);
	}

}
