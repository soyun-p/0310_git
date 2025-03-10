package work;

public class Ex1_work {
	public static void main(String[] args) {
		
		// 선생님 풀이
		
		int[] arr = {4, 13, 7, 19, 15};
		
		// arr에 담긴 값들 중 가장 큰 값을 출력. (배열 안의 숫자가 바뀌어도)
		
		// 가장 큰 값 : 19
		
		int max = arr[0];  // 배열 비교 후 갱신되는 큰 값을 저장할 공간
		
		for(int i = 1; i < arr.length; i++) {
			
			if( arr[i] > max ) {
				max = arr[i];	
		    }
				
		
		} // for
		
		System.out.println("가장 큰 값 : " + max);
		
		
		
	    System.out.println("-------------------");
	    
	    // 개선된 루프 이용
	    max = arr[0];
	    
	    for( int num : arr ) {  // 배열의 범위와 증감식이 모두 포함된 의미.
	    	if( num > max ) {
	    		max = num;
	    		
	    	} // if
	    	
	    } // for
	    
	    System.out.println("가장 큰 값 : " + max);
	    
	    
	    
	    System.out.println("-------------------");
	    
	    
	    // 오름차순 정리
	    // {4, 13, 7, 19, 15} -> 오름차순 결과 : 1, 4, 7, 13, 15, 19
	       
	    
	    for(int i = 0; i < arr.length; i++) {
	    	
	    	for(int j = i; j < arr.length; j++) {
	    		if( arr[j] < arr[i] ) {
	    		// 더 작은 값을 비교한 값과 자리를 바꾸는 과정.
	    		// 예를 들어, arr[0]과 arr[1]을 비교하여 작은 값을 [0]에, 큰 값을 [1]에 저장. 
	    			
	    			int tmp = arr[i];
	    			arr[i] = arr[j];
	    			arr[j] = tmp;
	    		
	    		} // if
	    		
	    	} // for inner
	    	
	    } // for outer
	    
	    for( int n : arr ) {
	    		System.out.print(n + " ");
	    } // for 2
	    
	    System.out.println("\n가장 큰 값 : " + arr[ arr.length-1 ] );
	    
		
	} // main

// i=0, j=0  :  arr[0](4) -> tmp. tmp=4. arr[0](0) -> arr[i(0)](0). arr[j(0)]=0. arr[j(0)] = tmp = 4.
// i=0, j=1  :  arr[1](13)-> tmp. tmp=13. arr[i()]

	
}
