package work;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		
		// 배열의 크기 : 5
		// 0번 : 5
		// 1번 : 3
		// 2번 : 2
		// 3번 : 11
		// 4번 : 20  (모두 키보드에서 입력)
		
		// 홀수의 갯수 : 3
		// 짝수의 갯수 : 2
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기 : ");
		int len = sc.nextInt();	
		
		int[] arr = new int[len];  // 입력받은 배열의 크기만큼 배열 생성
		
		
		// 배열 크기만큼 배열 입력
		for(int i = 0; i < len; i++) {
			System.out.printf("%d번 : ", i);
			arr[i] = sc.nextInt();
			
		} // for 1
		
		
		System.out.println("----------------");
		
		
		
		// 짝, 홀수 갯수 출력
		int odd = 0;  // 홀수
		int even = 0; // 짝수
		
		for(int num : arr ) {
			
			if( num % 2 == 0 ) { 
				even++;
		    }else {
		    	odd++;  	
		    } // if-else
			
		} // for 2
		
		System.out.println("홀수의 개수" + odd);
	    System.out.println("짝수의 개수" + even);
			
			
		
		
		
		
		
		
	} // main

}
