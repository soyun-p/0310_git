package ex1_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
		
		// 다차원 배열(multi array) 1차원 배열이 여러개 있는 것
		// 1차원 배열이 2개면 2차원, 3개면 3차원 배열.
		
		// 2차원 배열
		// int[][] arr = new int[ 각 1차원 배열의 수][ 각 1차원 배열의 index 수]; 즉, [큰 방][작은 방]으로 지칭.
		
		// 2차원 배열 선언 및 생성
		int[][] arr = new int[2][3];  // 0-1,2,3번 / 1-1,2,3번
		
		arr[0][0] = 100;  // 100 저장.
		arr[0][1] = 200;
		arr[0][2] = 300;
		
		arr[1][0] = 400;
	    arr[1][1] = 500;
	    arr[1][2] = 600;
	    // arr[1][3] = 700;  => 2차원 배열 역시 배열의 크기보다 넘어서는 값을 저장하는 것은 불가능.
	    
	    
	    
	    // 100 200 300
	    // 400 500 600
	    
	    for(int i = 0; i < arr.length; i++) {  // arr.length : 2. 큰 방의 갯수
	    	
	    	for(int j = 0; j < arr[i].length; j++) {  // arr[i].length : 3. (큰 방의 갯수를 참조하는) 작은 방의 갯수
	    		System.out.print(arr[i][j] + " ");
	    		
	    	} // for inner
	    	
	    	System.out.println();
	    	 	
	    } // for outer
	    
	    
	    
		
		
		
	} // main

}
