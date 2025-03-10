package ex1_multi_array;

public class Ex3_multi_arr {
	public static void main(String[] args) {
		
		// 선언, 생성, 서로 다른 배열 값 넣기
		
		String[][] students = { {"이름", "자바", "JSP"}, 
				               {"김길순", "100", "87"}, 
				               {"홍길동", "50", "70", "98"} };
		
		
		for(int i = 0; i < students.length; i++) {
			
			for(int j = 0; j < students[i].length; j++) { // 균일한 개수의 값이 들어가 있지 않아도 알아서 출력.
				
				System.out.print(students[i][j] + "\t");
				
			} // for inner
			
			System.out.println();
			
		} // for outer
		
		
		
	} // main

}
