package ex1_multi_array;

import java.util.Scanner;

public class Ex6_multi_arr_work {
	public static void main(String[] args) {
		
		// 2차원 배열 arr에 담긴 값 중 키보드에서 입력받은 값보다 큰 첫번째 요소 출력
		
		// 입력 : 10
		// 결과 : 11
		
		int[][] arr = { {1, 2, 3, 4, 5},
				        {6, 7, 8, 9},
				        {10, 11, 12, 13, 14, 15},
				        {16, 17, 18, 19, 20} };
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		
		out:for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				if( arr[i][j] > num ) {
					System.out.print("결과 : " + arr[i][j]);
					break out;
					
		        } // if
				
			} // for inner
			
		} // for outer
		
		
		
		
		
	} // main

}
