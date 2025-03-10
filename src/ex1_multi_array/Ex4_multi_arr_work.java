package ex1_multi_array;

public class Ex4_multi_arr_work {
	public static void main(String[] args) {
		
		// 2차원 배열 arr에 담긴 모든 값의 합과 평균 출력
		
		// 총 합 : 87
		// 평 균 : 5.4
		
		int[][] arr = { {5, 8, 3, 5}, 
				        {11, 6, 3},
				        {1, 2, 5, 9, 12},
				        {7, 3, 1, 6} };  // 다 더하면 87.
		
		int total = 0; // 모든 원소의 총합
		int sum = 0; // 모든 원소의 갯수
		
		for(int i = 0; i < arr.length; i++) {	
			
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];  // 원소의 총합 구하는 공식
				// sum++; 으로도 쓸수 있다. arr[i].length만큼 증가하기 때문.
						
			} // for inner
			
			sum += arr[i].length;  // 모든 원소의 갯수를 구하는 공식
		   
			
		} // for outer
		
		float avg = (float)total / sum;  // 평균 구하는 공식
		
		System.out.println("총 합 : " + total);
		System.out.printf("평 균 : %.1f\n", avg);
		
		
		
		
	} // main

}
