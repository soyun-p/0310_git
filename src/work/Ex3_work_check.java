package work;

import java.util.Scanner;

public class Ex3_work_check {
	public static void main(String[] args) {
		
		// 학생수 : 3 (키보드에서 입력)
		// 학생 1의 성적 : 90
		// 학생 2의 성적 : 75
		// 학생 3의 성적 : 84
		
		// 평균 성적 : 83.0
		// ---평균 이상인 학생들---
		// -> 학생 1
		// -> 학생 3
		// 평균 이상인 학생 수 : 2
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생수 : ");
		int stu_num = sc.nextInt();
		
		int[] grade = new int[stu_num];
		
		for(int i = 0; i < grade.length; i++) { // grade.length = stu_num
			System.out.printf("학생 %d의 성적 : ", i+1);
			grade[i] = sc.nextInt();  // grade[i] => 학생 점수
			     
		} // for
		
		System.out.println("-----------------------");
		
		int sum = 0;  // 모든 학생들의 점수 더해서 저장할 공간
		
		
		// 평균 계산
		for( int n : grade) {
			sum += n;		
		} // for 2
		
		float avg = (float)sum / stu_num;  // 평균 점수
			
		System.out.println("평균 성적 : " + avg);
	    
		System.out.println("---평균 이상인 학생들---");
	   
        int cnt = 0;  // 평균 이상인 학생들의 수 저장할 공간
		
		// 평균 이상인 학생들 계산
	    for(int i = 0; i < grade.length; i++) {
	    	// 점수가 평균 이상일 때 출력문
	    	if(grade[i] >= avg ) {
	    		cnt++;  // 평균 이상인 학생들과 점수가 출력될 때마다 평균 이상인 학생의 수도 증가.
	    		System.out.printf("-> 학생%d : %d\n", i+1, grade[i]);    		
	    	} // if
	    	
	    	
	    } // for 3
		
	    
	    System.out.println("평균 이상인 학생 수 : " + cnt); 
	    
	    
	    
	    
		
		
		
	} // main

}
